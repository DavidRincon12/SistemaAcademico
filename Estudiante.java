import java.util.Date;

class Estudiante extends Persona {
    Date fechaIngreso;
    String programa;
    String identificador;
    String codigo;
    String modalidad;
    
    public Estudiante(String nombre, String apellido, String correo, String telefono, Date fechaNacimiento, String direccion, String documento, String nacionalidad, String genero, Date fechaIngreso, String programa, String identificador, String codigo, String modalidad) {
        super(nombre, apellido, correo, telefono, fechaNacimiento, direccion, documento, nacionalidad, genero);
        this.fechaIngreso = fechaIngreso;
        this.programa = programa;
        this.identificador = identificador;
        this.codigo = codigo;
        this.modalidad = modalidad;
    }
}