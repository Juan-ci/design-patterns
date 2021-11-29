package com.mycompany.design.patterns;

public class mainDesign {
    
    public static void main(String[] args) {
        
        PizzaFactory pizzaFactory = new PizzaFactory();
        
        Pizza especial = pizzaFactory.crearPizzaChica();
        Pizza tropical = pizzaFactory.crearPizzaMediana();
        Pizza fugazzeta = pizzaFactory.crearPizzaGrande();
        
        System.out.println(especial);
        System.out.println(tropical);
        System.out.println(fugazzeta);
    }
}
