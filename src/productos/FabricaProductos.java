package productos;

import java.util.HashMap;
import java.util.Map;

// Elige el creador segun el tipo en tiempo de ejecucion, sin if/switch.
// Para un tipo nuevo solo se registra su creador: esta clase no cambia.
public class FabricaProductos {

    private final Map<String, CreadorProducto> creadores = new HashMap<>();

    public void registrarTipo(String tipo, CreadorProducto creador) {
        creadores.put(tipo, creador);
    }

    public Producto crearProducto(String tipo, Map<String, String> datos) {
        CreadorProducto creador = creadores.get(tipo);
        if (creador == null) {
            throw new IllegalArgumentException("Tipo no soportado: " + tipo);
        }
        return creador.registrarProducto(datos);
    }
}
