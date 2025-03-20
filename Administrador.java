class Administrador {
    Persona persona;
    CalendarioAcademico calendario;
    
    public Administrador(Persona persona, CalendarioAcademico calendario) {
        this.persona = persona;
        this.calendario = calendario;
    }
    
    public void registrarUsuario(Persona persona) {}
    public void actualizarInformacion(Persona persona) {}
    public void eliminarUsuario(Persona persona) {}
    public void asignarPrivilegios(Persona persona) {}
}