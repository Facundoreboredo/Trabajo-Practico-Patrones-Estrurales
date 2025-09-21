package Bridge;
public abstract class Notificacion {
    protected Canal canal;

    public Notificacion(Canal canal) {
        this.canal = canal;
    }

    public abstract void enviar(String mensaje);
}
