package Proxy;

// ArchivoProxy.java
import java.util.Arrays;
import java.util.List;

public class ArchivoProxy {
    private ArchivoReal archivoReal;
    private String usuario;

    // Lista de usuarios autorizados
    private static final List<String> usuariosPermitidos = Arrays.asList("admin", "juan");

    public ArchivoProxy(String nombreArchivo, String usuario) {
        this.usuario = usuario;
        this.archivoReal = new ArchivoReal(nombreArchivo);
    }

    public void abrir() {
        if (usuariosPermitidos.contains(usuario)) {
            archivoReal.abrir();
            archivoReal.leer();
        } else {
            System.out.println("Acceso denegado para el usuario: " + usuario);
        }
    }
}

