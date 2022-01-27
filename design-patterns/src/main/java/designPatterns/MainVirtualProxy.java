package designPatterns;

public class MainVirtualProxy {
    
    public static void main(String[] args) {
        
        Usuario usuario = new Usuario(5);
        IServicio proxy = new ProxyServicio(usuario);
        
        proxy.leer();
        proxy.escribir();
        proxy.eliminar();
        proxy.actualizar();
    }
}