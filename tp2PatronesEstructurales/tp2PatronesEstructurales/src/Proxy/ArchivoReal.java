package Proxy;

// ArchivoReal.java
public class ArchivoReal {
    private String nombre;

    public ArchivoReal(String nombre) {
        this.nombre = nombre;
    }

    public void abrir() {
        System.out.println("Abriendo archivo: " + nombre);
    }

    public void leer() {
        System.out.println("Leyendo contenido del archivo: " + nombre);
    }
}

