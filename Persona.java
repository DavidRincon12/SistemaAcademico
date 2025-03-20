import java.util.Date;

class Persona {
    // Atributos
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

    // Constructor
    public Persona(String nombre, String contraseña, Date fechaRegistro, String tipoDocumento, 
                   String numeroDocumento, String direccion, String telefono, String correo, 
                   Date fechaNacimiento, String estadoCivil, String nacionalidad, 
                   String datosProfesionales, String genero, String codigo, Rol rol) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.fechaRegistro = fechaRegistro;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoCivil = estadoCivil;
        this.nacionalidad = nacionalidad;
        this.datosProfesionales = datosProfesionales;
        this.genero = genero;
        this.codigo = codigo;
        this.rol = rol;
    }

    // Métodos públicos
    public void solicitarEmpleo() {
        System.out.println(nombre + " ha solicitado empleo.");
    }

    public void solicitarInscripcion() {
        System.out.println(nombre + " ha solicitado inscripción.");
    }

    public boolean iniciarSesion(String correo, String contraseña) {
        if (this.correo.equals(correo) && this.contraseña.equals(contraseña)) {
            System.out.println("Inicio de sesión exitoso para " + nombre);
            return true;
        } else {
            System.out.println("Inicio de sesión fallido.");
            return false;
        }
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDatosProfesionales() {
        return datosProfesionales;
    }

    public void setDatosProfesionales(String datosProfesionales) {
        this.datosProfesionales = datosProfesionales;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}