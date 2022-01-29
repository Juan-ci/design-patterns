package designPatterns;

public interface IManejadorTransaccion {

    void setManejador(IManejadorTransaccion next);
    
    void ejecutarTransaccion(Transaccion transaccion);
}
