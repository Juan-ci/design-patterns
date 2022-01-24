package designPatterns;

public class Fachada {

    private Computadora computadora;
    
    public Fachada() {
        ITeclado teclado = new Teclado();
        IMouse mouse = new Mouse();
        
        computadora = new Computadora(teclado, mouse);
    }
    
    public void encender() {
        this.computadora.encender();
    }
}
