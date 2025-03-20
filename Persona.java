import java.util.Date;

class Persona {
    private String nombre;
    private String contraseña;
    private Date fechaRegistro;
    private String tipoDocumento;
    private String numeroDocumento;
    private String direccion;
    private String telefono;
    private String correo;
    private Date fechaNacimiento;
    private String estadoCivil;
    private String nacionalidad;
    private String datosProfesionales;
    private String genero;
    private String codigo;
    private Rol rol;

    public Persona(String nombre, String correo, String codigo) {
        this.nombre = nombre;
        this.correo = correo;
        this.codigo = codigo;
    }
}