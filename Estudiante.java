import java.util.List;
import java.util.Date;

class Estudiante extends Persona {
    private Date fechaInscripcion;
    private String programa;
    private String estado;
    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<String> getBecas() {
        return becas;
    }

    public void setBecas(List<String> becas) {
        this.becas = becas;
    }

    public String getCorreoEstudiantil() {
        return correoEstudiantil;
    }

    public void setCorreoEstudiantil(String correoEstudiantil) {
        this.correoEstudiantil = correoEstudiantil;
    }

    public short getCreditosAprobados() {
        return creditosAprobados;
    }

    public void setCreditosAprobados(short creditosAprobados) {
        this.creditosAprobados = creditosAprobados;
    }

    private List<String> becas;
    private String correoEstudiantil;
    private short creditosAprobados;

    public Estudiante(String nombre, String correo, String codigo, Date fechaInscripcion, String programa) {
        super(nombre, correo, codigo);
        this.fechaInscripcion = fechaInscripcion;
        this.programa = programa;
    }
}