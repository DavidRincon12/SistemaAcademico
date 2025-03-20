import java.util.Date;

class PersonalAdministrativo extends Persona {
    private String cargo;

    public PersonalAdministrativo(String nombre, String correo, String codigo, String cargo) {
        super(nombre, correo, codigo);
        this.cargo = cargo;
    }

    public PersonalAdministrativo(String nombre, String contraseña, Date fechaRegistro, String tipoDocumento,
            String numeroDocumento, String direccion, String telefono, String correo, Date fechaNacimiento,
            String estadoCivil, String nacionalidad, String datosProfesionales, String genero, String codigo, Rol rol,
            String cargo) {
        super(nombre, contraseña, fechaRegistro, tipoDocumento, numeroDocumento, direccion, telefono, correo,
                fechaNacimiento, estadoCivil, nacionalidad, datosProfesionales, genero, codigo, rol);
        this.cargo = cargo;
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}