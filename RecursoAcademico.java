class RecursoAcademico {
    String ubicacionRecurso;
    String disponibilidad;
    String tipoRecurso;
    String nombreRecurso;
    String motivoUso;
    String codigoRecurso;
    
    public RecursoAcademico(String ubicacionRecurso, String disponibilidad, String tipoRecurso, String nombreRecurso, String motivoUso, String codigoRecurso) {
        this.ubicacionRecurso = ubicacionRecurso;
        this.disponibilidad = disponibilidad;
        this.tipoRecurso = tipoRecurso;
        this.nombreRecurso = nombreRecurso;
        this.motivoUso = motivoUso;
        this.codigoRecurso = codigoRecurso;
    }

    public String getUbicacionRecurso() {
        return ubicacionRecurso;
    }

    public void setUbicacionRecurso(String ubicacionRecurso) {
        this.ubicacionRecurso = ubicacionRecurso;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
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

    public String getMotivoUso() {
        return motivoUso;
    }

    public void setMotivoUso(String motivoUso) {
        this.motivoUso = motivoUso;
    }

    public String getCodigoRecurso() {
        return codigoRecurso;
    }

    public void setCodigoRecurso(String codigoRecurso) {
        this.codigoRecurso = codigoRecurso;
    }
}