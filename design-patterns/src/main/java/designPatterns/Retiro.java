package designPatterns;

public class Retiro implements IStrategy {

    public float realizarOperacion(float balance, float cantidad) {
        return balance - cantidad;
    }
}
