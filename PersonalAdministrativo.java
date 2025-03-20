class PersonalAdministrativo extends Persona {
    String cargo;
    
    public PersonalAdministrativo(String nombre, String apellido, String correo, String telefono, Date fechaNacimiento, String direccion, String documento, String nacionalidad, String genero, String cargo) {
        super(nombre, apellido, correo, telefono, fechaNacimiento, direccion, documento, nacionalidad, genero);
        this.cargo = cargo;
    }
    
    public void crearReporte() {
        System.out.println("Generando reporte administrativo...");
    }
}