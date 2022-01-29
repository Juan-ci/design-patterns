package designPatterns;

public class MainChainofResponsability {
    
    public static void main(String[] args) {
        
        Transaccion transaccion = new Transaccion(100, 200, TipoTransaccion.Reembolso);
        
        IManejadorTransaccion deposito = new Deposito();
        IManejadorTransaccion retiro = new Retiro();
        IManejadorTransaccion reembolso = new Reembolso();
        
        deposito.setManejador(retiro);
        retiro.setManejador(reembolso);
        
        reembolso.ejecutarTransaccion(transaccion);
    }
}
