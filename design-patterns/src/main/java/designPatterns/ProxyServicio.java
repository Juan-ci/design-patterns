package designPatterns;

public class ProxyServicio implements IServicio {

    private IServicio servicio; //Simulamos que el servicio es costoso de crear, lo limitamos a crear sólo si es necesario
    private Usuario usuario;
    
    public ProxyServicio(Usuario usuario) {
        this.usuario = usuario;
    }
    
    @Override
    public void leer() {
        this.obtenerServicio().leer();
    }

    @Override
    public void escribir() {
        if(usuario.getNivelUsuario() >= 5) {
            this.obtenerServicio().escribir();
        } else {
            throw new UnsupportedOperationException("Error de seguridad");
        }
    }

    @Override
    public void actualizar() {
        if(usuario.getNivelUsuario() >= 5) {
            this.obtenerServicio().actualizar();
        } else {
            throw new UnsupportedOperationException("Error de seguridad");
        }
    }

    @Override
    public void eliminar() {
        if(usuario.getNivelUsuario() >= 5) {
            this.obtenerServicio().eliminar();
        } else {
            throw new UnsupportedOperationException("Error de seguridad");
        }
    }
    
    private IServicio obtenerServicio() {
        if(this.servicio == null) {
            this.servicio = new Servicio();
        }
        
        return this.servicio;
    }
}
