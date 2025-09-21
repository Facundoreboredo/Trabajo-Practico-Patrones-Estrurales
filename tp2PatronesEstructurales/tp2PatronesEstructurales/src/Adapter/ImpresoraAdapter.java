package Adapter;

public class ImpresoraAdapter implements Impresora {
    private ImpresoraPDF pdf;
    private ImpresoraTexto texto;
    private String tipo;

    public ImpresoraAdapter(String tipo) {
        this.tipo = tipo;
        if (tipo.equalsIgnoreCase("pdf")) pdf = new ImpresoraPDF();
        else if (tipo.equalsIgnoreCase("texto")) texto = new ImpresoraTexto();
    }

    @Override
    public void imprimir(String contenido) {
        if (tipo.equalsIgnoreCase("pdf"))
            pdf.imprimirPDF(contenido);
        else if (tipo.equalsIgnoreCase("texto"))
            texto.imprimirTextoPlano(contenido);
        else
            System.out.println("Tipo de impresora no soportado: " + tipo);
    }
}