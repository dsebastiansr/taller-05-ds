package datos;

import productos.Producto;
import java.util.List;

public interface AccesoDatos {
    void guardarProducto(Producto producto);
    Producto buscarProducto(String codigo);
    List<Producto> listarProductos();
}
