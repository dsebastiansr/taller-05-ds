package productos;

import java.util.Map;

public class CreadorProductoDigital extends CreadorProducto {

    @Override
    protected Producto crearProducto(Map<String, String> d) {
        return new ProductoDigital(d.get("codigo"), d.get("nombre"),
            Double.parseDouble(d.get("precio")), Integer.parseInt(d.get("stock")),
            Double.parseDouble(d.get("tamano")), d.get("formato"));
    }
}
