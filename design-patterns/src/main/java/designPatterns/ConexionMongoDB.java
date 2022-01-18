package designPatterns;

public class ConexionMongoDB implements IConexionNoSQL{
    
    public void conexion() {
        System.out.println("Conexion con MongoDB");
    }
    
    public String executeSentence() {
        return "Consulta MongoDB";
    }
}
