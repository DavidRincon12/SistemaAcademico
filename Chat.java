import java.util.ArrayList;
import java.util.List;

public class Chat {
    private List<Persona> participantes;

    public Chat() {
        this.participantes = new ArrayList<>();
    }

    public List<Persona> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Persona> participantes) {
        this.participantes = participantes;
    }
}