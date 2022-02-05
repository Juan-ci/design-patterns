package designPatterns;

public class Deposito implements IStrategy {

    public float realizarOperacion(float balance, float cantidad) {
        return balance + cantidad;
    }
}
