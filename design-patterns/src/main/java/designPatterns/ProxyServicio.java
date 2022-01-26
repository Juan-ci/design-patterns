package designPatterns;

public class ProxyServicio implements IServicio {

    private IServicio servicio;
    private Usuario usuario;
    
    public ProxyServicio(IServicio servicio, Usuario usuario) {
        this.servicio = servicio;
        this.usuario = usuario;
    }
    
    @Override
    public void leer() {
        this.servicio.leer();
    }

    @Override
    public void escribir() {
        if(usuario.getNivelUsuario() >= 5) {
            this.servicio.escribir();
        } else {
            throw new UnsupportedOperationException("Error de seguridad");
        }
    }

    @Override
    public void actualizar() {
        if(usuario.getNivelUsuario() >= 5) {
            this.servicio.actualizar();
        } else {
            throw new UnsupportedOperationException("Error de seguridad");
        }
    }

    @Override
    public void eliminar() {
        if(usuario.getNivelUsuario() >= 5) {
            this.servicio.eliminar();
        } else {
            throw new UnsupportedOperationException("Error de seguridad");
        }
    }
    
}
