class Nota {
    Asignatura asignatura;
    float calificacion;
    String tipo;
    
    public Nota(Asignatura asignatura, float calificacion, String tipo) {
        this.asignatura = asignatura;
        this.calificacion = calificacion;
        this.tipo = tipo;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
