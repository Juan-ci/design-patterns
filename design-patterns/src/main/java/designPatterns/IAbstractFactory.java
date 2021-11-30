package designPatterns;

public interface IAbstractFactory {

    IComputadora crearComputadora();
    
    ITablet crearTablet();
}
