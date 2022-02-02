package designPatterns;

public class MainMemento {
    
    public static void main(String[] args) {
        
        Usuario usuario = new Usuario("Franco", 21);
        
        Usuario memento = usuario.getMemento();
        
        System.out.println("Estado original: " + usuario.getNombre() + " " + usuario.getEdad());
        
        usuario.setNombre("Emanuel");
        usuario.setEdad(32);
        
        System.out.println(usuario.getNombre() + " " + usuario.getEdad());
        
        usuario.restartMemento(memento);
        
        System.out.println("Copia restaurada: " + usuario.getNombre() + " " + usuario.getEdad());
    }
}
