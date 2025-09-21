package Facade;

// TiendaFacade.java
public class TiendaFacade {
    private Carrito carrito;
    private Pago pago;
    private Envio envio;

    public TiendaFacade() {
        this.carrito = new Carrito();
        this.pago = new Pago();
        this.envio = new Envio();
    }

    public void comprar(String producto, double precio) {
        // Paso 1: Agregar producto al carrito
        carrito.agregarProducto(producto);

        // Paso 2: Procesar pago
        if (pago.procesarPago(precio)) {
            // Paso 3: Enviar producto
            envio.enviar(producto);
            System.out.println("Compra finalizada con éxito");
        } else {
            System.out.println("Error en el pago ");
        }
    }
}

