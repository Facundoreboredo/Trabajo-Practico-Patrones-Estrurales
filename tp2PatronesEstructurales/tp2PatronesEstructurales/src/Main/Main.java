package Main;

import Decorator.*;
import Adapter.*;
import Bridge.*;
import Facade.*;
import FlyWeight.*;
import Proxy.*;
import Composite.*;


public class Main {
    public static void main(String[] args) {
        //1. Adapter
        Impresora impresoraPDF = new ImpresoraAdapter("pdf");
        impresoraPDF.imprimir("Reporte Anual 2025");

        Impresora impresoraTexto = new ImpresoraAdapter("texto");
        impresoraTexto.imprimir("Lista de Tareas");

        //2. Bridge
        System.out.println("_________________________________________");

        Notificacion alertaEmail = new Alerta(new CanalEmail());
        alertaEmail.enviar("El servidor está caído");

        // Enviar Recordatorio por SMS
        Notificacion recordatorioSMS = new Recordatorio(new CanalSMS());
        recordatorioSMS.enviar("Tenés una reunión a las 15:00");

        // Enviar Promoción por Email
        Notificacion promoEmail = new Promocion(new CanalEmail());
        promoEmail.enviar("50% de descuento en tu próxima compra");


        // 3. Decorator
        System.out.println("_________________________________________");

        Plan plan1 = new PlanBasico();
        System.out.println(plan1.getDescripcion() + " - $" + plan1.getCosto());

        Plan plan2 = new HD(new PlanBasico());
        System.out.println(plan2.getDescripcion() + " - $" + plan2.getCosto());

        Plan plan3 = new DescargasOffline(new HD(new PlanBasico()));
        System.out.println(plan3.getDescripcion() + " - $" + plan3.getCosto());

        Plan plan4 = new UltraHD(new DescargasOffline(new HD(new PlanBasico())));
        System.out.println(plan4.getDescripcion() + " - $" + plan4.getCosto());

        Plan plan5 = new UltraHD(new DescargasOffline((new PlanBasico())));
        System.out.println(plan5.getDescripcion() + " - $" + plan5.getCosto());
        FabricaDeArboles fabrica = new FabricaDeArboles();

        //4. Facade
        System.out.println("_________________________________________");

        TiendaFacade tienda = new TiendaFacade();
        tienda.comprar("Notebook", 1200.50);


        // Simular 10 árboles con pocos tipos - 5. Flyweight
        System.out.println("_________________________________________");

        String[] tipos = {"Pino", "Roble", "Abeto"};
        String[] colores = {"Verde", "Oscuro"};
        String[] texturas = {"Lisa", "Rugosa"};

        int totalArboles = 0;

        for (int i = 0; i < 10; i++) {
            String tipo = tipos[i % tipos.length];
            String color = colores[i % colores.length];
            String textura = texturas[i % texturas.length];

            // Estado extrínseco: posición
            int x = i % 1000;
            int y = i / 1000;

            Arbol arbol = fabrica.obtenerArbol(tipo, color, textura);
            arbol.dibujar(x, y);

            totalArboles++;
        }

        System.out.println("Total árboles dibujados: " + totalArboles);
        System.out.println("Objetos ArbolConcreto creados (Flyweight): " + fabrica.cantidadArbolesCreados());


        //6. Proxy
        System.out.println("_________________________________________");

        ArchivoProxy archivo1 = new ArchivoProxy("documento_secreto.pdf", "admin");
        archivo1.abrir();

        ArchivoProxy archivo2 = new ArchivoProxy("documento_secreto.pdf", "maria");
        archivo2.abrir();




        // Platos individuales - 7. Composite
        System.out.println("_________________________________________");

        ElementoMenu plato1 = new Plato("Milanesa con papas", 2500);
        ElementoMenu plato2 = new Plato("Ensalada César", 1800);
        ElementoMenu plato3 = new Plato("Pizza Muzza", 2200);
        ElementoMenu plato4 = new Plato("Helado", 900);

        // Menú de almuerzo
        Menu menuAlmuerzo = new Menu("Almuerzo");
        menuAlmuerzo.agregarElemento(plato1);
        menuAlmuerzo.agregarElemento(plato2);

        // Menú de cena
        Menu menuCena = new Menu("Cena");
        menuCena.agregarElemento(plato3);
        menuCena.agregarElemento(plato4);

        // Menú general que contiene submenús
        Menu menuGeneral = new Menu("Menú Completo");
        menuGeneral.agregarElemento(menuAlmuerzo);
        menuGeneral.agregarElemento(menuCena);

        // Mostrar todo el menú
        menuGeneral.mostrar("");
    }
}

