package designPatterns;

public class mainSingleton {
    
    public static void main(String[] args) {
        
        Thread t1 = new Thread(new Runnable(){
            public void run() {
                ConexionDB conexion = ConexionDB.getConexion();
                
                System.out.println(conexion.hashCode());
            }
        });
        
        Thread t2 = new Thread(new Runnable(){
            public void run() {
                ConexionDB conexion = ConexionDB.getConexion();
                
                System.out.println(conexion.hashCode());
            }
        });
        
        t1.start();
        t2.start();
    }
}
