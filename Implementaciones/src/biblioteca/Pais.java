package biblioteca;

public class Pais {
    private int codigo;
    private String nombre;

    public Pais( int codigo, String nombre){
        this.codigo=codigo;
        this.nombre=nombre;
    }
    /**
     * @return int return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
    public String toString(){
        return "pais="+nombre+" codigo="+codigo;
    }

}
