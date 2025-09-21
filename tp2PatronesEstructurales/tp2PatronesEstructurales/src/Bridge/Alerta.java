package Bridge;

public class Alerta extends Notificacion {
    public Alerta(Canal canal) {
        super(canal);
    }

    @Override
    public void enviar(String mensaje) {
        canal.enviar("[ALERTA] " + mensaje);
    }
}

