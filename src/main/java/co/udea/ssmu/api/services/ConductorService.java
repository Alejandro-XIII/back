package co.udea.ssmu.api.services;

import co.udea.ssmu.api.dao.IConductorDAO;
import co.udea.ssmu.api.exception.DriverNotFoundException;
import co.udea.ssmu.api.model.Conductor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class ConductorService {
    @Autowired
    private IConductorDAO dao;
    public Conductor guardar(Conductor t) {return dao.save(t);}
    public String borrar(int id) {dao.deleteById(id);  return "Conductor removido";}
    public Iterable<Conductor> list() {return dao.findAll();}
    public Optional<Conductor> listId(int id){ return dao.findById(id);}
    public Conductor actualizar(Conductor t){
        Conductor conductorExistente = dao.findById(t.getIdConductor()).orElse(null);
        conductorExistente.setNombre(t.getNombre());
        conductorExistente.setCelular(t.getCelular());
        conductorExistente.setEmail(t.getEmail());
        conductorExistente.setCedula(t.getCedula());
        conductorExistente.setCiudadActual(t.getCiudadActual());
        conductorExistente.setRol(t.getRol());
        conductorExistente.setNroServicios(t.getNroServicios());
        conductorExistente.setNroFelicitaciones(t.getNroFelicitaciones());
        conductorExistente.setNroAmonestaciones(t.getNroAmonestaciones());
        conductorExistente.setPromedioCalificacion(t.getPromedioCalificacion());
        conductorExistente.setPlaca(t.getPlaca());
        return dao.save(conductorExistente);
    }

    public List<Conductor> clasificarConductoresPorCiudad(String ciudad) {
        List<Conductor> conductores = dao.findByCiudad(ciudad);
        if (conductores.size()>0){
            return conductores;
        } else throw new DriverNotFoundException("No hay conductores de "+ciudad);
    }

    public List<Conductor> clasificarConductoresPorPromedio(int promedio) throws DriverNotFoundException {
        List<Conductor> conductores = dao.findByPromedioCalificacionGreaterThan(promedio);
        if (conductores.size()>0){
            return conductores;
        } else throw new DriverNotFoundException("No hay conductores con promedio igual a "+promedio);
    }
}
