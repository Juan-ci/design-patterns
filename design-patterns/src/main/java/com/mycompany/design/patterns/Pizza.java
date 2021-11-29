package com.mycompany.design.patterns;

public class Pizza {

    private int cantidadPorciones;
    
    public Pizza(int cantidadPorciones) {
        this.cantidadPorciones = cantidadPorciones;
    }
    
    public String toString() {
        return "Cantidad de porcines: " + this.cantidadPorciones;
    }
}
