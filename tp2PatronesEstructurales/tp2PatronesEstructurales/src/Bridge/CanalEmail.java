package Bridge;
public class CanalEmail implements Canal {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando por Email: " + mensaje);
    }
}

