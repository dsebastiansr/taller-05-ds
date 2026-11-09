package datos;

import productos.Producto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ConexionBD implements AccesoDatos {

    private static volatile ConexionBD instancia;
    private final Map<String, Producto> productos = new HashMap<>(); // BD simulada

    private ConexionBD() {
        System.out.println("Conexion a la BD creada");
    }

    public static ConexionBD getInstancia() {
        if (instancia == null) {
            synchronized (ConexionBD.class) {
                if (instancia == null) {
                    instancia = new ConexionBD();
                }
            }
        }
        return instancia;
    }

    @Override
    public synchronized void guardarProducto(Producto producto) {
        productos.put(producto.getCodigo(), producto);
    }

    @Override
    public synchronized Producto buscarProducto(String codigo) {
        return productos.get(codigo);
    }

    @Override
    public synchronized List<Producto> listarProductos() {
        return new ArrayList<>(productos.values());
    }
}
