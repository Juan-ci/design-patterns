package designPatterns;

public class Usuario {

    public String nombre;
    public String apellido;
    
    public boolean medioContacto = false;   //Sólo si es true se puede asignar valores a direccion, mail, telefono.
    
    public String direccion;
    public String mail;
    public String telefono;
    
    private Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        
        this.mail = "";
        this.direccion = "";
        this.telefono = "";
    }
    
    public static Usuario Make(String nombre, String apellido) {
        return new Usuario(nombre, apellido);
    }

    
    public UsuarioBuilder setMedioContacto(boolean medioContacto) {
        
        if(!medioContacto) {
            throw new IllegalArgumentException("No es posible asignar false a medioContacto");
        }
        
        this.medioContacto = medioContacto;
        return new UsuarioBuilder(this);
    }
    
    public Usuario Build() {
        return this;
    }
    
    @Override
    public String toString() {
        return this.nombre + " " + this.apellido + " " + this.mail + " " + this.direccion + " " + this.telefono;
    }
    
    public static class UsuarioBuilder {
    
        private Usuario usuario;
        
        public UsuarioBuilder(Usuario usuario) {
            this.usuario = usuario;
        }
        
        public UsuarioBuilder setDireccion(String direccion) {
            usuario.direccion = direccion;
            return this;
        }

        public UsuarioBuilder setMail(String mail) {
            usuario.mail = mail;
            return this;
        }

        public UsuarioBuilder setTelefono(String telefono) {
            usuario.telefono = telefono;
            return this;
        }
        
        public Usuario Build() {
            return usuario;
        }
    }
}
