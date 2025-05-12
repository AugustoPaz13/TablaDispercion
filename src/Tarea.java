import java.util.UUID;

public class Tarea {
    private String codigo;
    private String nombre;
    private String descripcion;
    private String estado; // "pendiente", "en progreso", "finalizada"
    private String fechaInicio;
    private String fechaFin;
    private boolean esAlta;

    public Tarea(String nombre, String descripcion, String estado, String fechaInicio, String fechaFin) {
        this.codigo = UUID.randomUUID().toString().substring(0, 5); // Solo 5 caracteres
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.esAlta = true;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public String getEstado() { return estado; }
    public String getFechaInicio() { return fechaInicio; }
    public String getFechaFin() { return fechaFin; }
    public boolean isEsAlta() { return esAlta; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setEstado(String estado) { this.estado = estado; }
    public void setFechaInicio(String fechaInicio) { this.fechaInicio = fechaInicio; }
    public void setFechaFin(String fechaFin) { this.fechaFin = fechaFin; }
    public void setEsAlta(boolean esAlta) { this.esAlta = esAlta; }

    @Override
    public String toString() {
        return "Tarea [" +
                "código=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", descripción='" + descripcion + '\'' +
                ", estado=" + estado +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", esAlta=" + esAlta +
                ']';
    }
}
