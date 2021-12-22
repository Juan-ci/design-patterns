package designPatterns;

public class mainSingleton {
    
    public static void main(String[] args) {
        
        ConexionDB conexion1 = ConexionDB.getConexion();
        ConexionDB conexion2 = ConexionDB.getConexion();
        
        System.out.println(conexion1.hashCode());
        //Imprimimos en consola el hashCode y vemos que son los mismos.
        System.out.println(conexion2.hashCode());
        
    }
}
