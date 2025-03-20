import java.util.Date;

class Horario {
    String materia;
    Docente docente;
    String dia;
    Date horaInicio;
    Date horaFin;
    
    public Horario(String materia, Docente docente, String dia, Date horaInicio, Date horaFin) {
        this.materia = materia;
        this.docente = docente;
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }
    
    public void asignarHorario(String dia, Date horaInicio, Date horaFin) {
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }
    
    public void modificarHorario(String dia, Date horaInicio, Date horaFin) {
        asignarHorario(dia, horaInicio, horaFin);
    }
}