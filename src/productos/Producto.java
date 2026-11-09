package productos;

public abstract class Producto {

    protected String codigo;
    protected String nombre;
    protected double precio;
    protected int stock;

    protected Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public abstract String getDetalle();

    public String getCodigo() { return codigo; }

    @Override
    public String toString() {
        return codigo + " - " + nombre + " $" + precio + " (stock " + stock + ") " + getDetalle();
    }
}
