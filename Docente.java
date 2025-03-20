import java.util.Date;
import java.util.List;

class Docente extends Persona {
    private String correoInstitucional;
    private List<String> asignaturas;
    private String tipo;
    private String horarioAsesoria;

    public Docente(String nombre, String correo, String codigo, String correoInstitucional, String tipo) {
        super(nombre, correo, codigo);
        this.correoInstitucional = correoInstitucional;
        this.tipo = tipo;
    }
}