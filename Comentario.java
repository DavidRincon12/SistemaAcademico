class Comentario {
    String contenido;
    Date fecha;
    Persona autor;
    
    public Comentario(String contenido, Date fecha, Persona autor) {
        this.contenido = contenido;
        this.fecha = fecha;
        this.autor = autor;
    }
}