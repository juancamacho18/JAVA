package smart;

public class Actor {
    private String nombre;
    private Pais nacionalidad;
    private String experiencia;
    public Actor (String nombre, Pais nacionalidad, String experiencia){
        this.nombre=nombre;
        this.nacionalidad=nacionalidad;
        this.experiencia=experiencia;
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
     * @return Pais return the nacionalidad
     */
    public Pais getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @param nacionalidad the nacionalidad to set
     */
    public void setNacionalidad(Pais nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * @return String return the experiencia
     */
    public String getExperiencia() {
        return experiencia;
    }

    /**
     * @param experiencia the experiencia to set
     */
    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
    public String toString(){
        return "ACTOR("+nombre+", nacionalidad="+nacionalidad.getNombre()+", experiencia="+experiencia+") ";
    }

}
