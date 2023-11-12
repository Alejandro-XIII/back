package co.udea.ssmu.api.model;

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
@Table(name = "conductor")
public class Conductor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_conductor")
    private int idConductor;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "celular")
    private String celular;
    @Column(name = "email")
    private String email;
    @Column(name = "cedula")
    private String cedula;
    @Column(name = "ciudad_actual")
    private String ciudadActual;
    @Column(name = "rol")
    private String rol;
    @Column(name = "nro_servicios")
    private int nroServicios;
    @Column(name = "nro_felicitaciones")
    private int nroFelicitaciones;
    @Column(name = "nro_amonestaciones")
    private int nroAmonestaciones;
    @Column(name = "promedio_calificacion")
    private int promedioCalificacion;
    @Column(name = "placa")
    private String placa;
}
