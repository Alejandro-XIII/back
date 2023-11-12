package co.udea.ssmu.api.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@ApiModel(description = "Todos los detalles sobre conductor")
@Table(name = "conductor")
public class Conductor implements Serializable {
    @ApiModelProperty(notes = "La ID del conductor")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_conductor")
    private int idConductor;
    @ApiModelProperty(notes= "El nombre completo del conductor")
    @Column(name = "nombre")
    private String nombre;
    @ApiModelProperty(notes= "El número de celular del conductor")
    @Column(name = "celular")
    private String celular;
    @ApiModelProperty(notes= "El correo electronico del conductor")
    @Column(name = "email")
    private String email;
    @ApiModelProperty(notes= "El número de cedula del conductor")
    @Column(name = "cedula")
    private String cedula;
    @ApiModelProperty(notes= "La ciudad actual donde está el conductor")
    @Column(name = "ciudad_actual")
    private String ciudadActual;
    @ApiModelProperty(notes= "El rol del conductor")
    @Column(name = "rol")
    private String rol;
    @ApiModelProperty(notes= "La cantida de servicios realizados por el conductor")
    @Column(name = "nro_servicios")
    private int nroServicios;
    @ApiModelProperty(notes= "La cantida de felicitaciones que tiene el conductor")
    @Column(name = "nro_felicitaciones")
    private int nroFelicitaciones;
    @ApiModelProperty(notes= "La cantida de amonestaciones que tiene el conductor")
    @Column(name = "nro_amonestaciones")
    private int nroAmonestaciones;
    @ApiModelProperty(notes= "El promedio de calificaciones que tiene el conductor")
    @Column(name = "promedio_calificacion")
    private int promedioCalificacion;
    @ApiModelProperty(notes= "Número de la placa del carro del conductor")
    @Column(name = "placa")
    private String placa;
}
