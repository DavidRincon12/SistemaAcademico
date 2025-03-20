import java.util.Date;

class Docente extends Persona {
    private String correoInstitucional;
    private String tipo;
    private String horarioAsesoria;



    public Docente(String nombre, String contraseña, Date fechaRegistro, String tipoDocumento, String numeroDocumento,
            String direccion, String telefono, String correo, Date fechaNacimiento, String estadoCivil,
            String nacionalidad, String datosProfesionales, String genero, String codigo, Rol rol,
            String correoInstitucional, String tipo, String horarioAsesoria) {
        super(nombre, contraseña, fechaRegistro, tipoDocumento, numeroDocumento, direccion, telefono, correo,
                fechaNacimiento, estadoCivil, nacionalidad, datosProfesionales, genero, codigo, rol);
        this.correoInstitucional = correoInstitucional;
        this.tipo = tipo;
        this.horarioAsesoria = horarioAsesoria;
    }

    public Docente(String nombre, String correo, String codigo, String correoInstitucional, String tipo,
            String horarioAsesoria) {
        super(nombre, correo, codigo);
        this.correoInstitucional = correoInstitucional;
        this.tipo = tipo;
        this.horarioAsesoria = horarioAsesoria;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
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