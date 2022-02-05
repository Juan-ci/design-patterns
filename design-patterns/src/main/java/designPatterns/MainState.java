package designPatterns;

public class MainState {
    
    public static void main(String[] args) {
        
        IEstadoAuto auto = new Auto();
        
        auto.encender();
        auto.manejar();
        auto.apagar();
    }
}
