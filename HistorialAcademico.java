import java.util.List;
import java.util.ArrayList;

class HistorialAcademico {
    Estudiante estudiante;
    List<Nota> notas;
    
    public HistorialAcademico(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.notas = new ArrayList<>();
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }
}