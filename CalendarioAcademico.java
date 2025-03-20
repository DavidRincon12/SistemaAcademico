class CalendarioAcademico {
    String nombrePeriodo;
    Date fechaInicioPeriodo;
    Map<String, Date> fechasImportantes;
    
    public CalendarioAcademico(String nombrePeriodo, Date fechaInicioPeriodo) {
        this.nombrePeriodo = nombrePeriodo;
        this.fechaInicioPeriodo = fechaInicioPeriodo;
        this.fechasImportantes = new HashMap<>();
    }
    
    public void agregarFechaImportante(String evento, Date fecha) {
        fechasImportantes.put(evento, fecha);
    }
    
    public void eliminarFechaImportante(String evento) {
        fechasImportantes.remove(evento);
    }
    
    public void listarFechasImportantes() {
        for (Map.Entry<String, Date> entry : fechasImportantes.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}