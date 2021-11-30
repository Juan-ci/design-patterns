package designPatterns;

public class mainDesign {
    
    public static void main(String[] args) {
        
        AppleStore apple = new AppleStore();
        SamsungStore samsung = new SamsungStore();
        
        IComputadora mac = apple.crearComputadora();
        ITablet ipad = apple.crearTablet();
        
        IComputadora galaxyGo = samsung.crearComputadora();
        ITablet galaxyTab = samsung.crearTablet();
        
        System.out.println(mac);
        System.out.println(ipad);
        System.out.println(galaxyGo);
        System.out.println(galaxyTab);
    }
}
