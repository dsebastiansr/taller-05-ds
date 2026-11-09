package productos;

import java.util.Map;

public class CreadorProductoFisico extends CreadorProducto {

    @Override
    protected Producto crearProducto(Map<String, String> d) {
        return new ProductoFisico(d.get("codigo"), d.get("nombre"),
            Double.parseDouble(d.get("precio")), Integer.parseInt(d.get("stock")),
            Double.parseDouble(d.get("peso")), d.get("dimensiones"));
    }
}
