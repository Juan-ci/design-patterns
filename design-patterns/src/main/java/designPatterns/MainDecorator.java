package designPatterns;

public class MainDecorator {
    
    public static void main(String[] args) {
        
        IPizza peperoniQuesoExtra = new QuesoExtra(new PizzaPeperoni());
        
        System.out.println(peperoniQuesoExtra.descripcion());
        System.out.println(peperoniQuesoExtra.precio());
        
        IPizza orillaRellena = new OrillaRellena(new PizzaHawaiana());
        
        System.out.println(orillaRellena.descripcion());
        System.out.println(orillaRellena.precio());
        
        IPizza rellenaQuesoExtra = new OrillaRellena(new QuesoExtra(new PizzaHawaiana()));
        
        System.out.println(rellenaQuesoExtra.descripcion());
        System.out.println(rellenaQuesoExtra.precio());
    }
}
