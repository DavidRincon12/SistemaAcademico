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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Persona getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Persona destinatario) {
        this.destinatario = destinatario;
    }
}