package vehiculo;

public class Motor {
    private int fuerza;
    private double radio;
    private double revoluciones;

    public Motor(int fuerza, double radio){
        this.fuerza=fuerza;
        this.radio=radio;
        revoluciones=calcularRevoluciones();
    }

    public double calcularRevoluciones(){
        return fuerza*radio;
    }
    /**
     * @return int return the fuerza
     */
    public int getFuerza() {
        return fuerza;
    }

    /**
     * @param fuerza the fuerza to set
     */
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    /**
     * @return double return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String toString(){
        return revoluciones+" r.p.m";
    }
}
