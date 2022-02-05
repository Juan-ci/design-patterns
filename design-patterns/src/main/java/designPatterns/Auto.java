package designPatterns;

public class Auto implements IEstadoAuto {

    private IEstadoAuto autoEncendido;
    private IEstadoAuto autoManejando;
    private IEstadoAuto autoApagado;
    
    IEstadoAuto estadoActual;
    
    public Auto() {
        this.autoEncendido = new AutoEncender(this);
        this.autoManejando = new AutoManejar(this);
        this.autoApagado = new AutoApagar(this);
        
        this.estadoActual = null;
    }

    public IEstadoAuto getAutoEncendido() {
        return autoEncendido;
    }

    public void setAutoEncendido(IEstadoAuto autoEncendido) {
        this.autoEncendido = autoEncendido;
    }

    public IEstadoAuto getAutoManejando() {
        return autoManejando;
    }

    public void setAutoManejando(IEstadoAuto autoManejando) {
        this.autoManejando = autoManejando;
    }

    public IEstadoAuto getAutoApagado() {
        return autoApagado;
    }

    public void setAutoApagado(IEstadoAuto autoApagado) {
        this.autoApagado = autoApagado;
    }

    public IEstadoAuto getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(IEstadoAuto estadoActual) {
        this.estadoActual = estadoActual;
    }
    
    public void encender() {
        this.estadoActual.encender();
    }
    
    public void manejar() {
        this.estadoActual.manejar();
    }
    
    public void apagar() {
        this.estadoActual.apagar();
    }
}
