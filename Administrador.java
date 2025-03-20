class Administrador extends Persona {
    private CalendarioAcademico calendario;

    public Administrador(String nombre, String correo, String codigo, CalendarioAcademico calendario) {
        super(nombre, correo, codigo);
        this.calendario = calendario;
    }

    public CalendarioAcademico getCalendario() {
        return calendario;
    }

    public void setCalendario(CalendarioAcademico calendario) {
        this.calendario = calendario;
    }
}