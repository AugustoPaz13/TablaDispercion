public class Main {
    public static void main(String[] args) {
        Tabla tabla = new Tabla();

        Tarea t1 = new Tarea("TP AYED", "Implementar hash", "pendiente", "2025-05-10", "2025-05-12");
        Tarea t2 = new Tarea("Estudiar", "Parcial de Sistemas", "en progreso", "2025-05-11", "2025-05-14");

        tabla.insertar(t1);
        tabla.insertar(t2);

        tabla.mostrarTabla();

        System.out.println("\nBuscar t1: " + tabla.buscar(t1.getCodigo()));

        tabla.eliminar(t1.getCodigo());

        System.out.println("\nDespués de eliminar t1:");
        tabla.mostrarTabla();
    }
}

