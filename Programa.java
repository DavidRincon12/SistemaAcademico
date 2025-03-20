import java.util.List;
import java.util.ArrayList;

class Programa {
    String nombre;
    List<Materia> materias;
    
    public Programa(String nombre) {
        this.nombre = nombre;
        this.materias = new ArrayList<>();
    }
}