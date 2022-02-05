package designPatterns;

public class AutoManejar implements IEstadoAuto {
    
    private final Auto auto;
    
    public AutoManejar(Auto auto) {
        this.auto = auto;
    }

    public void encender() {
        System.out.println("El auto ya está encendido.");
    }
    
    public void manejar() {
        System.out.println("El auto está en movimiento.");
    }
    
    public void apagar() {
        auto.setEstadoActual(auto.getAutoApagado());
        System.out.println("El auto está apagado.");
    }
}
