package videojuego;

public class Personaje {
    protected String nombre;
    protected int salud;
    protected int nivel;
    public Personaje(String nombre, int salud, int nivel) {
        this.nombre = nombre;
        this.salud = salud;
        this.nivel=nivel;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getSalud() {
        return salud;
    }
    public void setSalud(int salud) {
        this.salud = salud;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    @Override
    public String toString() {
        return "nombre=" + nombre + ", salud=" + salud + ", nivel=" + nivel;
    }
    
    


    
}