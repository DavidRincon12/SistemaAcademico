class Docente extends Persona {
    String constitucionLaboral;
    String[] tipo;
    String horarioSesion;
    
    public Docente(String nombre, String apellido, String correo, String telefono, Date fechaNacimiento, String direccion, String documento, String nacionalidad, String genero, String constitucionLaboral, String[] tipo, String horarioSesion) {
        super(nombre, apellido, correo, telefono, fechaNacimiento, direccion, documento, nacionalidad, genero);
        this.constitucionLaboral = constitucionLaboral;
        this.tipo = tipo;
        this.horarioSesion = horarioSesion;
    }
}