package designPatterns;

public class AutoApagar implements IEstadoAuto {
    
    private final Auto auto;
    
    public AutoApagar(Auto auto) {
        this.auto = auto;
    }

    public void encender() {
        System.out.println("El auto está encendido.");
        auto.setEstadoActual(auto.getAutoEncendido());
    }
    
    public void manejar() {
        System.out.println("El auto no se puede manejar si está apagado.");
    }
    
    public void apagar() {
        System.out.println("El auto está apagado.");
    }
}
