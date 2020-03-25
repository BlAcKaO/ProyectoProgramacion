package App.Model;

public class CocheVenta extends Coche{
    float precioVenta;

    public CocheVenta() {
    }

    public CocheVenta(String codigo, String marca, String modelo, float precioVenta) {
        super(codigo, marca, modelo);
        this.precioVenta = precioVenta;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }
}
