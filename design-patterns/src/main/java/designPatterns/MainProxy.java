package designPatterns;

public class MainProxy {
    
    public static void main(String[] args) {
        
        Usuario usuario = new Usuario(3);
        IServicio proxy = new ProxyServicio(new Servicio(), usuario);
        
        proxy.leer();
        proxy.escribir();
        proxy.eliminar();
        proxy.actualizar();
    }
}
