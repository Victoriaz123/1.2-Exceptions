//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Venta venta = new Venta();

        // intentamos calcular el total de la venta sin añadir productos. Genera la exception porque la lista esta vacia
        try {
            venta.calcularTotal();
        } catch (VentaBuidaException e) {   //capturamos la exception y mostramos el error
            System.out.println(e.getMessage());
        }

       // Aqui ya el calculo es correcto y no sale ningun error
        Producto p1 = new Producto("Zumo", 3.0);
        Producto p2 = new Producto("Agua", 2.0);
        venta.anadirProducto(p1);
        venta.anadirProducto(p2);

        try {
            venta.calcularTotal();
            System.out.println("Precio total de la venta: " + venta.getPrecioTotal());
        } catch (VentaBuidaException e) {
            System.out.println(e.getMessage());
        }

        // Intentar acceder a un índex fuera del ArrayList para generar IndexOutOfBoundsException
        try {    // Solo tenemos 2 elementos, en la posicion 0 y 1. Intentamos a acceder a index 2
            Producto productoQueNoExiste = venta.getProducto(2);
            System.out.println("Producto en la posicion 2 " + productoQueNoExiste.getNombre());
        } catch (IndexOutOfBoundsException e) {    // Capturamos la exception IndexOutOfBoundsException
            System.out.println("Error: Intento de acceder a un index fuera de la lista.");
            System.out.println("Mensaje de la exception: " + e.getMessage());
        } finally {
            System.out.println("Imprimimos algun mensaje final");
        }
    }
}