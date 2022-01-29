package designPatterns;

public class Deposito implements IManejadorTransaccion {
    
    private IManejadorTransaccion next;
    
    public void setManejador(IManejadorTransaccion next) {
        this.next = next;
    }
    
    public void ejecutarTransaccion(Transaccion transaccion) {
        
        if(transaccion.getTipo() == TipoTransaccion.Deposito) {
            float cantidad = transaccion.getCantidad() + transaccion.getBalance();
            System.out.println("El balance después del depósito es: " + cantidad);
        } else {
            this.next.ejecutarTransaccion(transaccion);
        }
    }
}
