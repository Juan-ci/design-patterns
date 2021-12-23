package designPatterns;

public class mainBuilder {
    
    public static void main(String[] args) {
        
        Usuario jorge = Usuario.Make("Jorge", "Letardo")
                .setDireccion("Avenida siempre viva")
                .setMail("jorge@eltucu.com")
                .setTelefono("xxx-xxx-xxxxxxx")
                .Build();
        
        System.out.println(jorge);
    }
}
