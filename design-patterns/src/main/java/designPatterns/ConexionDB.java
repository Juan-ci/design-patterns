package designPatterns;

public class ConexionDB {

    private static ConexionDB conexion;
    
    private ConexionDB() {
    
    }
    
    public synchronized static ConexionDB getConexion() {
        
        if(conexion == null) {
            conexion = new ConexionDB();
        }
        
    return conexion;
    }
}
