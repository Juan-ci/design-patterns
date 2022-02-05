package designPatterns;

public class Transaccion {

    IStrategy strategy;
    
    public Transaccion(IStrategy strategy) {
        this.strategy = strategy;
    }
    
    public float ejecutarTransaccion(float balance, float cantidad) {
        return this.strategy.realizarOperacion(balance, cantidad);
    }
}
