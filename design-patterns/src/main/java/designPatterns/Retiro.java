package designPatterns;

public class Retiro implements IManejadorTransaccion {
    
    private IManejadorTransaccion next;
    
    public void setManejador(IManejadorTransaccion next) {
        this.next = next;
    }
    
    public void ejecutarTransaccion(Transaccion transaccion) {
        
        if(transaccion.getTipo() == TipoTransaccion.Retiro) {
            float cantidad = transaccion.getCantidad() - transaccion.getBalance();
            System.out.println("El balance después del retiro es: " + cantidad);
        } else {
            this.next.ejecutarTransaccion(transaccion);
        }
    }
}
