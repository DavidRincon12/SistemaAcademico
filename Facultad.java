import java.util.List;
import java.util.ArrayList;

class Facultad {
    String nombre;
    List<Programa> programas;
    
    public Facultad(String nombre) {
        this.nombre = nombre;
        this.programas = new ArrayList<>();
    }
}
