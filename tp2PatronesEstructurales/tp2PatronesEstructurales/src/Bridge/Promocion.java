package Bridge;

public class Promocion extends Notificacion {
    public Promocion(Canal canal) {
        super(canal);
    }

    @Override
    public void enviar(String mensaje) {
        canal.enviar("[PROMOCIÓN] " + mensaje);
    }
}
