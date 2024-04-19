package biblioteca;

public class Editorial {
    private int codigo;
    private String nombre;
    private Pais pais;

    public Editorial (int codigo, String nombre, Pais pais){
        this.codigo=codigo;
        this.nombre=nombre;
        this.pais=pais;
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

    /**
     * @return Pais return the pais
     */
    public Pais getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(Pais pais) {
        this.pais = pais;
    }
    @Override
    public String toString() {
        return "Editorial{ codigo=" + codigo + ", nombre=" + nombre + "', pais de origen=" + pais +"}";
    }
}
