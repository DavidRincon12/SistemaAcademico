import java.util.Date;

class ReservaRecurso {
    Date fechaInicio;
    Date fechaFin;
    String tipoRecurso;
    String nombreRecurso;
    String motivoReserva;
    String codigoRecurso;
    
    public ReservaRecurso(Date fechaInicio, Date fechaFin, String tipoRecurso, String nombreRecurso, String motivoReserva, String codigoRecurso) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tipoRecurso = tipoRecurso;
        this.nombreRecurso = nombreRecurso;
        this.motivoReserva = motivoReserva;
        this.codigoRecurso = codigoRecurso;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getTipoRecurso() {
        return tipoRecurso;
    }

    public void setTipoRecurso(String tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }

    public String getNombreRecurso() {
        return nombreRecurso;
    }

    public void setNombreRecurso(String nombreRecurso) {
        this.nombreRecurso = nombreRecurso;
    }

    public String getMotivoReserva() {
        return motivoReserva;
    }

    public void setMotivoReserva(String motivoReserva) {
        this.motivoReserva = motivoReserva;
    }

    public String getCodigoRecurso() {
        return codigoRecurso;
    }

    public void setCodigoRecurso(String codigoRecurso) {
        this.codigoRecurso = codigoRecurso;
    }
}