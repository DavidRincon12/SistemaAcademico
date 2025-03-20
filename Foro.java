import java.util.ArrayList;
import java.util.List;

class Foro {
    String tema;
    String descripcion;
    List<Comentario> comentarios;
    
    public Foro(String tema, String descripcion) {
        this.tema = tema;
        this.descripcion = descripcion;
        this.comentarios = new ArrayList<>();
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
}