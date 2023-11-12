package co.udea.ssmu.api.controller;

import co.udea.ssmu.api.exception.InvalidRating;
import co.udea.ssmu.api.exception.ModelNotFoundException;
import co.udea.ssmu.api.model.Conductor;
import co.udea.ssmu.api.services.ConductorService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/conductor")
@CrossOrigin(origins = "*")
@Api(value = "Sistema de gestión de conductores",description = "operación para conductores")
public class ConductorController {
    @Autowired
    private ConductorService conductorService;

    @ApiOperation(value = "Agregar conductor")
    @PostMapping("/guardar")
    public int guardar(
            @ApiParam(value = "almacenar objeto de conductor en tabla de base de datos",required = true)
            @RequestBody Conductor conductor) throws InvalidRating {
        if (conductor.getPromedioCalificacion()>5) {
            throw new InvalidRating("El promedio debe ser menor o igual a 5");
        }
        conductorService.guardar(conductor);
        return conductor.getIdConductor();
    }

    @ApiOperation(value = "Ver lista de conductores", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "Lista recuperada exitosamente"),
            @ApiResponse(code = 401,message = "No está autorizado para ver el recurso"),
            @ApiResponse(code = 403,message = "Este recurso está protegido"),
            @ApiResponse(code = 404,message = "Conductor no encontrado")
    })
    @GetMapping("/listar")
    public Iterable<Conductor> listarConductores(){return conductorService.list();}

    @ApiOperation(value = "Ver un conductor")
    @GetMapping("listar{id}")
    public Conductor verConductor(@ApiParam(value = "Id del conductor del objeto conductor", required = true)
                                  @PathVariable("id") int id) {
        Optional<Conductor> conductor = conductorService.listId(id);
        if (conductor.isPresent()){
            return conductor.get();
        }
        throw new ModelNotFoundException("Id de conductor invalid");
    }

    @ApiOperation(value = "Ver los mejores conductores")
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
}

