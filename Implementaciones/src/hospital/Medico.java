package hospital;

public class Medico {
    private int cedula;
    private String nombre;
    private String especialidad;
    public Medico(int cedula, String nombre, String especialidad){
        this.cedula=cedula;
        this.nombre=nombre;
        this.especialidad=especialidad;
    }
    /**
     * @return int return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
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
     * @return String return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public String toString(){
        return "Medico='"+getNombre()+"'";
    }
}
