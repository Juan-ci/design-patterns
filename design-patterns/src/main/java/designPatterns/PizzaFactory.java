package designPatterns;

public class PizzaFactory implements IPizzeria {
    
    public Pizza crearPizza(String tamaño, String tipo) {
        
        if(tamaño.equals("Chica")) {
            return new Pizza( 6, tipo);
        } else {
            return new Pizza(8, tipo);
        }
    }
    
}
