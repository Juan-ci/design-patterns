package designPatterns;

public class AppleStore implements IAbstractFactory {

    public IComputadora crearComputadora(){
    
        return new MacboockPro();
    }
    
    public ITablet crearTablet() {
    
        return new IPad();
    }
}
