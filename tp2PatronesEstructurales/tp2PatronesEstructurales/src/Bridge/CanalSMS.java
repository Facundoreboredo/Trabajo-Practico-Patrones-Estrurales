package Bridge;

public class CanalSMS implements Canal {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando por SMS: " + mensaje);
    }
}
