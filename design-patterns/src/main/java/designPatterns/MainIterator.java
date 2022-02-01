package designPatterns;

public class MainIterator {
    
    public static void main(String[] args) {
        
        GuiaTelefonica guia = new GuiaTelefonica();
        
        guia.add("123");
        guia.add("456");
        guia.add("789");
        guia.add("0123");
        guia.add("456");
        
        Iterador iterador = new IteradorGuia(guia);
        
        while( iterador.contieneSiguiente()) {
            System.out.println(iterador.siguiente());
        }
    }
}
