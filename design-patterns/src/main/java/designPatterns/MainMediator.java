package designPatterns;

public class MainMediator {
    
    public static void main(String[] args) {
        
        Usuario eduardo = new Usuario("Eduardo");
        Usuario sebastian = new Usuario("Sebastian");
        
        SalaChat sala = new SalaChat();
        
        sala.addParticipante(eduardo);
        sala.addParticipante(sebastian);
        
        sala.enviarMensaje(eduardo, sebastian, "Hola, estoy implementando el patron de diseño mediator!");
    }
}
