package hospital;

import java.time.LocalDate;

public class Paciente {
    private int cedula;
    private String nombre;
    private String direccion;
    private LocalDate fecha;
    public Paciente (int cedula, String nombre, String direccion, LocalDate fecha){
        this.cedula=cedula;
        this.nombre=nombre;
        this.direccion=direccion;
        this.fecha=fecha;
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
     * @return String return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return DateFormat return the fecha
     */
    public LocalDate getFecha() {
        return fecha;
    }
    /**
     * @param fecha the fecha to set
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
