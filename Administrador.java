class Administrador extends Persona {
    private CalendarioAcademico calendario;

    public Administrador(String nombre, String correo, String codigo, CalendarioAcademico calendario) {
        super(nombre, correo, codigo);
        this.calendario = calendario;
    }
}