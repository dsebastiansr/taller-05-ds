package productos;

import datos.*;
import java.util.Map;

// Factory Method: cada subclase decide que producto concreto crear
public abstract class CreadorProducto {

    protected abstract Producto crearProducto(Map<String, String> datos);

    public Producto registrarProducto(Map<String, String> datos) {
        Producto producto = crearProducto(datos);
        AccesoDatos bd = ConexionBD.getInstancia();
        bd.guardarProducto(producto);
        return producto;
    }
}
