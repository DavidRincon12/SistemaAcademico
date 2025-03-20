class Mensaje {
    String contenido;
    Date fecha;
    Persona remitente;
    Persona destinatario;
    
    public Mensaje(String contenido, Date fecha, Persona remitente, Persona destinatario) {
        this.contenido = contenido;
        this.fecha = fecha;
        this.remitente = remitente;
        this.destinatario = destinatario;
    }
}