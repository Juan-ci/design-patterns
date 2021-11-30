package designPatterns;

public class mainDesign {
    
    public static void main(String[] args) {
        
        PizzaFactory pizzaFactory = new PizzaFactory();
        
        Pizza especial = pizzaFactory.crearPizza("Chica", "Especial");
        Pizza tropical = pizzaFactory.crearPizza("Grande ", "Tropical");
        
        System.out.println(especial);
        System.out.println(tropical);
        
    }
}
