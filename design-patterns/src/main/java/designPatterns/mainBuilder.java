package designPatterns;

public class mainBuilder {
    
    public static void main(String[] args) {
        
        Usuario jorge = Usuario.Make("Jorge", "Letardo")
                .setMedioContacto(true)
                .setDireccion("avenida siempre viva")
                .setMail("jorge@google.com")
                .setTelefono("xxx-xxx-xxxxx")
                .Build();
        
        System.out.println(jorge);
    }
}
