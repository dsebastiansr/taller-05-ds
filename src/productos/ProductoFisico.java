package productos;

public class ProductoFisico extends Producto {

    private double peso;
    private String dimensiones;

    public ProductoFisico(String codigo, String nombre, double precio, int stock,
                          double peso, String dimensiones) {
        super(codigo, nombre, precio, stock);
        this.peso = peso;
        this.dimensiones = dimensiones;
    }

    @Override
    public String getDetalle() {
        return "[Fisico] peso: " + peso + " kg, dimensiones: " + dimensiones;
    }
}
