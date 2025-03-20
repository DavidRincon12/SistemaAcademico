import java.util.Date;

class PersonalAdministrativo extends Persona {
    private String cargo;

    public PersonalAdministrativo(String nombre, String correo, String codigo, String cargo) {
        super(nombre, correo, codigo);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}