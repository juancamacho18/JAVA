package biblioteca;

public class Autor {
    private String nombre;
    private Pais paisDeorigen;

    public Autor (String nombre, Pais paisDeorigen){
        this.nombre= nombre;
        this.paisDeorigen= paisDeorigen;
    }
    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Pais return the paisDeorigen
     */
    public Pais getPaisDeorigen() {
        return paisDeorigen;
    }

    /**
     * @param paisDeorigen the paisDeorigen to set
     */
    public void setPaisDeorigen(Pais paisDeorigen) {
        this.paisDeorigen = paisDeorigen;
    }
    @Override
    public String toString() {
        return "AUTOR{ nombre=" + nombre + ", pais=" + paisDeorigen +  "}";
    }
}
