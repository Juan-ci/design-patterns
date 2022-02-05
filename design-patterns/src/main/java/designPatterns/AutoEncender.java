package designPatterns;

public class AutoEncender implements IEstadoAuto {
    
    private final Auto auto;
    
    public AutoEncender(Auto auto) {
        this.auto = auto;
    }
    
    public void encender() {
        System.out.println("El auto está encendido.");
    }
    
    public void manejar() {
        System.out.println("El auto está en movimiento.");
        auto.setEstadoActual(auto.getAutoManejando());
    }
    
    public void apagar() {
        System.out.println("El auto está apagado.");
        auto.setEstadoActual(auto.getAutoApagado());
    }
}
