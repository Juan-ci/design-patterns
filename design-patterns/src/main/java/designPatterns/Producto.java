package designPatterns;

import java.util.Set;
import java.util.LinkedHashSet;

public class Producto implements IObservable {

    private int stock;
    private Set<IObserver> observadores;

    public Producto(int stock) {
        this.stock = stock;
        this.observadores = new LinkedHashSet<>();
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public void venta() {
        this.setStock(this.stock - 1);
        System.out.println("Producto vendido!");
        
        this.notifyObserver();
    }
    
    @Override
    public void addObserver(IObserver obs) {
        this.observadores.add(obs);
    }
    
    @Override
    public void notifyObserver() {
        this.observadores.forEach(s -> s.notificacion("El producto se vendió!"));
    }
}