class HistorialAcademico {
    Estudiante estudiante;
    List<Nota> notas;
    
    public HistorialAcademico(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.notas = new ArrayList<>();
    }
}