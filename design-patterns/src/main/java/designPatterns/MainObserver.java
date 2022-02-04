package designPatterns;

public class MainObserver {
    
    public static void main(String[] args) {
        
        Producto palta = new Producto(10);
        
        Usuario user1 = new Usuario();
        Usuario user2 = new Usuario();
        Usuario user3 = new Usuario();
        
        palta.addObserver(user1);
        palta.addObserver(user2);
        
        palta.venta();
    }
}
