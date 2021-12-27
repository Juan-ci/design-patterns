package designPatterns;

public class Enemigo {
    
    private String imagen;
    private int posX;
    private int posY;
    private int cantidadVida;

    public Enemigo(String imagen, int posX, int posY, int cantidadVida) {
        this.setImagen(imagen);
        this.setPosX(posX);
        this.setPosY(posY);
        this.setCantidadVida(cantidadVida);
    }
    
    public Enemigo(Enemigo enemigo) {
        this.setImagen(enemigo.getImagen());
        this.setPosX(enemigo.getPosX());
        this.setPosY(enemigo.getPosY());
        this.setCantidadVida(enemigo.getCantidadVida());
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getCantidadVida() {
        return cantidadVida;
    }

    public void setCantidadVida(int cantidadVida) {
        this.cantidadVida = cantidadVida;
    }
    
    public Enemigo clone() {
        return new Enemigo(this);   //se puede utilizar cualquiera de los dos constructores
        //return new Enemigo(this.imagen, this.posX, this.posY, this.cantidadVida);
    }
    
    @Override
    public String toString() {
        return this.imagen + " " + this.posX + " " + this.posY + " " + this.cantidadVida;
    }
}
