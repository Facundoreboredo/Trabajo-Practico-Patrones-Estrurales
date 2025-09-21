package FlyWeight;

// Flyweight Factory
import java.util.HashMap;
import java.util.Map;
public class FabricaDeArboles {
    private Map<String, Arbol> arboles = new HashMap<>();

    // La clave se construye a partir del estado intrínseco
    private String generarClave(String tipo, String color, String textura) {
        return tipo + "-" + color + "-" + textura;
    }

    public Arbol obtenerArbol(String tipo, String color, String textura) {
        String clave = generarClave(tipo, color, textura);
        Arbol arbol = arboles.get(clave);
        if (arbol == null) {
            arbol = new ArbolConcreto(tipo, color, textura);
            arboles.put(clave, arbol);
        }
        return arbol;
    }

    public int cantidadArbolesCreados() {
        return arboles.size();
    }
}
