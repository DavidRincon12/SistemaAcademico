class Asignatura {
    String nombre;
    Docente docente;
    List<Estudiante> estudiantes;
    
    public Asignatura(String nombre, Docente docente) {
        this.nombre = nombre;
        this.docente = docente;
        this.estudiantes = new ArrayList<>();
    }
    
    public void asignarProfesor(Docente profesor) {
        this.docente = profesor;
    }
    
    public void eliminarProfesor() {
        this.docente = null;
    }
}