package designPatterns;

public class SamsungStore implements IAbstractFactory {
    
    public IComputadora crearComputadora() {
        
        return new GalaxyGo();
    }
    
    public ITablet crearTablet() {
    
        return new GalaxyTab();
    }
}
