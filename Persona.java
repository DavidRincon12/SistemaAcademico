class Persona {
    String nombre;
    String apellido;
    String correo;
    String telefono;
    Date fechaNacimiento;
    String direccion;
    String documento;
    String nacionalidad;
    String genero;
    
    public Persona(String nombre, String apellido, String correo, String telefono, Date fechaNacimiento, String direccion, String documento, String nacionalidad, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.documento = documento;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
    }
}