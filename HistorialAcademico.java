import java.util.List;
import java.util.ArrayList;

class HistorialAcademico {
    Estudiante estudiante;
    List<Nota> notas;
    
    public HistorialAcademico(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.notas = new ArrayList<>();
    }
}