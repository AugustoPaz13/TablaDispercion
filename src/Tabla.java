public class Tabla {
    private Tarea[] tabla;
    private int numElementos;
    private final int TAM = 101;

    public Tabla() {
        tabla = new Tarea[TAM];
        numElementos = 0;
    }

    public boolean insertar(Tarea t) {
        int posicion = calcularPosicion(t.getCodigo());
        int i = 0;
        while (tabla[posicion] != null && tabla[posicion].isEsAlta()) {
            i++;
            if (i >= TAM) return false; // Tabla llena
            posicion = resolverColision(posicion, i);
        }
        tabla[posicion] = t;
        numElementos++;
        return true;
    }

    public Tarea buscar(String codigo) {
        int posicion = calcularPosicion(codigo);
        int i = 0;
        while (tabla[posicion] != null) {
            if (tabla[posicion].getCodigo().equals(codigo) && tabla[posicion].isEsAlta()) {
                return tabla[posicion];
            }
            i++;
            if (i >= TAM) return null;
            posicion = resolverColision(posicion, i);
        }
        return null;
    }

    public boolean eliminar(String codigo) {
        Tarea t = buscar(codigo);
        if (t != null) {
            t.setEsAlta(false);
            return true;
        }
        return false;
    }

    private int obtenerValorNumerico(String codigo) {
        int valor = 0;
        for (int i = 0; i < codigo.length(); i++) {
            valor += codigo.charAt(i);
        }
        return valor;
    }

    public int calcularPosicion(String codigo) {
        double A = 0.6180339887;
        int valor = obtenerValorNumerico(codigo);
        double producto = valor * A;
        double decimal = producto - Math.floor(producto);
        return (int)(decimal * TAM);
    }

    public int resolverColision(int posicionInicial, int i) {
        return (posicionInicial + i * i) % TAM;
    }

    public double calcularFactorCarga() {
        return (double) numElementos / TAM;
    }

    public void mostrarTabla() {
        for (int i = 0; i < TAM; i++) {
            if (tabla[i] != null && tabla[i].isEsAlta()) {
                System.out.println("Posición " + i + ": " + tabla[i]);
            }
        }
    }
}
