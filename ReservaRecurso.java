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
}