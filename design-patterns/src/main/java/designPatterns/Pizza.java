package designPatterns;

public class Pizza {

    private int cantidadPorciones;
    private String especialidad;
    
    public Pizza(int cantidadPorciones, String especialidad) {
        this.cantidadPorciones = cantidadPorciones;
        this.especialidad = especialidad;
    }
    
    public String toString() {
        return "Cantidad de porciones: " + this.cantidadPorciones + "\nEspecialidad: "+ especialidad;
    }
}
