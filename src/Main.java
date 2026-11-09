import datos.ConexionBD;
import productos.CreadorProductoDigital;
import productos.CreadorProductoFisico;
import productos.FabricaProductos;
import productos.Producto;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Singleton
        ConexionBD a = ConexionBD.getInstancia();
        ConexionBD b = ConexionBD.getInstancia();
        System.out.println("Misma instancia: " + (a == b));

        // Factory Method
        FabricaProductos fabrica = new FabricaProductos();
        fabrica.registrarTipo("FISICO", new CreadorProductoFisico());
        fabrica.registrarTipo("DIGITAL", new CreadorProductoDigital());

        Map<String, String> laptop = new HashMap<>();
        laptop.put("codigo", "F-001");
        laptop.put("nombre", "Laptop");
        laptop.put("precio", "899.99");
        laptop.put("stock", "15");
        laptop.put("peso", "1.4");
        laptop.put("dimensiones", "32x22x2 cm");

        Map<String, String> ebook = new HashMap<>();
        ebook.put("codigo", "D-001");
        ebook.put("nombre", "E-book Patrones");
        ebook.put("precio", "24.50");
        ebook.put("stock", "100");
        ebook.put("tamano", "8.5");
        ebook.put("formato", "PDF");

        fabrica.crearProducto("FISICO", laptop);
        fabrica.crearProducto("DIGITAL", ebook);

        for (Producto p : ConexionBD.getInstancia().listarProductos()) {
            System.out.println(p);
        }
    }
}
