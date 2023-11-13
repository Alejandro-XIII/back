package co.udea.ssmu.api.controller;

import co.udea.ssmu.api.exception.InvalidRating;
import co.udea.ssmu.api.exception.ModelNotFoundException;
import co.udea.ssmu.api.model.Conductor;
import co.udea.ssmu.api.services.ConductorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/conductor")
@CrossOrigin(origins = "*")
public class ConductorController {
    @Autowired
    private ConductorService conductorService;

    @PostMapping("/guardar")
    public int guardar(
            @RequestBody Conductor conductor) throws InvalidRating {
        if (conductor.getPromedioCalificacion()>5) {
            throw new InvalidRating("El promedio debe ser menor o igual a 5");
        }
        conductorService.guardar(conductor);
        return conductor.getIdConductor();
    }

    @GetMapping("/listar")
    public Iterable<Conductor> listarConductores(){return conductorService.list();}

    @GetMapping("listar{id}")
    public Conductor verConductor(@PathVariable("id") int id) {
        Optional<Conductor> conductor = conductorService.listId(id);
        if (conductor.isPresent()){
            return conductor.get();
        }
        throw new ModelNotFoundException("Id de conductor invalid");
    }

    @GetMapping("/mejoresConductores")
    public ResponseEntity<List<Conductor>> verMejorConductores(){
        List<Conductor> list = conductorService.verMejorConductores();
        return new ResponseEntity<List<Conductor>>(list, HttpStatus.ACCEPTED);
    }

    @PutMapping
    public Conductor actualizarService(@RequestBody Conductor conductor){
        return conductorService.actualizar(conductor);
    }

    @DeleteMapping("/{id}")
    public String borrarConductor(@PathVariable int id){
        return conductorService.borrar(id);
    }

    @GetMapping("/clasificarPorCiudad/{ciudad}")
    public ResponseEntity<List<Conductor>> clasificarConductoresPorCiudad(@PathVariable("ciudad") String ciudad) {
        List<Conductor> conductores = conductorService.clasificarConductoresPorCiudad(ciudad);
        return new ResponseEntity<List<Conductor>>(conductores, HttpStatus.ACCEPTED);
    }
}

