package designPatterns;

public class Transaccion {
    
    private float cantidad;
    private float balance;
    private TipoTransaccion tipo;

    public Transaccion(float cantidad, float balance, TipoTransaccion tipo) {
        this.cantidad = cantidad;
        this.balance = balance;
        this.tipo = tipo;
    }
    
    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public TipoTransaccion getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransaccion tipo) {
        this.tipo = tipo;
    }
    
    
}
