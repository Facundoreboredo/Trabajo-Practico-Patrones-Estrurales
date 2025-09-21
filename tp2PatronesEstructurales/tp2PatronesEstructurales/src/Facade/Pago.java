package Facade;

// Pago.java
public class Pago {
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " ...");
        // Simulamos que el pago siempre se realiza correctamente
        System.out.println("Pago realizado con éxito.");
        return true;
    }
}
