package designPatterns;

public class OrillaRellena implements IPizza {

    private IPizza pizza;
    
    public OrillaRellena(IPizza pizza) {
        this.pizza = pizza;
    }
    
    @Override
    public String descripcion() {
        return this.pizza.descripcion() + " con orilla Rellena";
    }

    @Override
    public float precio() {
        return this.pizza.precio() + 4;
    }
}
