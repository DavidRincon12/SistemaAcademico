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
    //Metodos
}