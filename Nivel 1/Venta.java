import java.util.ArrayList;
import java.util.List;

public class Venta {

    private List<Producto> productos;
    private double precioTotal= 0.0;

    public Venta() {
        this.productos = new ArrayList<>();
        this.precioTotal = precioTotal;
    }

    public void anadirProducto(Producto producto) {
        productos.add(producto);
    }

    public void calcularTotal() throws VentaBuidaException {
        if (productos.isEmpty()){
            throw new VentaBuidaException();
        }
        precioTotal= 0.0;
    for (Producto producto:productos){
        precioTotal+= producto.getPrecio();
        }
    }

    public double getPrecioTotal() {
            return precioTotal;
        }

     public Producto getProducto(int index) {
        return productos.get(index); 
    }
    }


