package designPatterns;

public class MainCommand {
    
    public static void main(String[] args) {
        
        IDevice tv = new TV();
        
        ICommand on = new OnDevice(tv);
        ICommand off = new OffDevice(tv);
        
        on.operacion();
        off.operacion();
    }
}
