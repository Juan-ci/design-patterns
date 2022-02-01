package designPatterns;

public class TV implements IDevice {

    private boolean on;
    
    public TV() {
        this.on = false;
    }
    
    public void on() {
        this.on = true;
        System.out.println("TV encendida.");
    }
    
    public void off() {
        this.on = false;
        System.out.println("TV apagada.");
    }
}
