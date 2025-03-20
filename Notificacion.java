import java.util.Date;

class Notificacion {
    Date fecha;
    String contenido;
    Persona destinatario;
    
    public Notificacion(Date fecha, String contenido, Persona destinatario) {
        this.fecha = fecha;
        this.contenido = contenido;
        this.destinatario = destinatario;
    }
}