package designPatterns;

public class Usuario {

    public String nombre;
    public String apellido;
    
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

    public Usuario setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public Usuario setMail(String mail) {
        this.mail = mail;
        return this;
    }

    public Usuario setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }
    
    public Usuario Build() {
        return this;
    }
    
    @Override
    public String toString() {
        return this.nombre + " " + this.apellido + " " + this.mail + " " + this.direccion + " " + this.telefono;
    }
    
}
