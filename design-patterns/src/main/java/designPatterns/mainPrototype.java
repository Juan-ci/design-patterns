package designPatterns;

public class mainPrototype {
    
    public static void main(String[] args) {
        
        //IConexionSQL conexion = new ConexionMySQL();
        IConexionSQL conexion = new AdapterDB(new ConexionMongoDB());
        
        conexion.conexion();
        
        String resultado = conexion.runQuery();
        System.out.println(resultado);
    }
}
