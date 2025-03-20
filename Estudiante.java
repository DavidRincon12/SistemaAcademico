import java.util.List;
import java.util.Date;

class Estudiante extends Persona {
    private Date fechaInscripcion;
    private String programa;
    private String estado;
    private List<String> becas;
    private String correoEstudiantil;
    private short creditosAprobados;

    public Estudiante(String nombre, String correo, String codigo, Date fechaInscripcion, String programa) {
        super(nombre, correo, codigo);
        this.fechaInscripcion = fechaInscripcion;
        this.programa = programa;
    }
}