package designPatterns;

public class Reembolso implements IManejadorTransaccion {
    
    private IManejadorTransaccion next;
    
    public void setManejador(IManejadorTransaccion next) {
        this.next = next;
    }
    
    public void ejecutarTransaccion(Transaccion transaccion) {
        
        if(transaccion.getTipo() == TipoTransaccion.Reembolso) {
            float cantidad = transaccion.getCantidad() + transaccion.getBalance();
            System.out.println("El balance después del reembolso es: " + cantidad);
        } else {
            System.out.println("Transaccion no válida.");
        }
    }
}
