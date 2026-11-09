package productos;

public class ProductoDigital extends Producto {

    private double tamanoMB;
    private String formato;

    public ProductoDigital(String codigo, String nombre, double precio, int stock,
                           double tamanoMB, String formato) {
        super(codigo, nombre, precio, stock);
        this.tamanoMB = tamanoMB;
        this.formato = formato;
    }

    @Override
    public String getDetalle() {
        return "[Digital] tamano: " + tamanoMB + " MB, formato: " + formato;
    }
}
