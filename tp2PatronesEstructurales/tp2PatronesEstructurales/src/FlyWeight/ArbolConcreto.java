package FlyWeight;

// Implementación concreta de Arbol
public class ArbolConcreto implements Arbol {
    private final String tipo;    // Estado intrínseco
    private final String color;   // Estado intrínseco
    private final String textura; // Estado intrínseco

    public ArbolConcreto(String tipo, String color, String textura) {
        this.tipo = tipo;
        this.color = color;
        this.textura = textura;
        System.out.println("Creando objeto para árbol: " + tipo + ", color: " + color);
    }
    @Override
    public void dibujar(int x, int y) {
        System.out.println("Dibujando árbol '" + tipo + "' de color " + color +
                " en posición (" + x + "," + y + ")");
    }
}
