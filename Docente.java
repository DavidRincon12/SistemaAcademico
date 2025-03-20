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

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }

    public List<String> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<String> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHorarioAsesoria() {
        return horarioAsesoria;
    }

    public void setHorarioAsesoria(String horarioAsesoria) {
        this.horarioAsesoria = horarioAsesoria;
    }
}