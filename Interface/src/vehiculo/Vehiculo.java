package vehiculo;

public class Vehiculo {
    protected double velocidadactual;
    protected double velocidadmaxima;
    protected int fuerza;
    protected double radio;

    public Vehiculo (double velocidadactual, double velocidadmaxima, int fuerza, double radio){
        this.velocidadactual=velocidadactual;
        this.velocidadmaxima=velocidadmaxima;
        this.fuerza=fuerza;
        this.radio=radio;
    }

    public double acelerar (double velocidadanterior){
        return velocidadactual+velocidadanterior;
    }

    public double frenar (double velocidadanterior){
        return velocidadactual-velocidadanterior;
    }

    public void mostrarVelocidades (){
        System.out.println("Velocidad actual del vehiculo:"+velocidadactual+", velocidad maxima del vehiculo:"+velocidadmaxima);
    }
    /**
     * @return double return the velocidadactual
     */
    public double getVelocidadactual() {
        return velocidadactual;
    }

    /**
     * @param velocidadactual the velocidadactual to set
     */
    public void setVelocidadactual(double velocidadactual) {
        this.velocidadactual = velocidadactual;
    }

    /**
     * @return double return the velocidadmaxima
     */
    public double getVelocidadmaxima() {
        return velocidadmaxima;
    }

    /**
     * @param velocidadmaxima the velocidadmaxima to set
     */

    

    public void setVelocidadmaxima(double velocidadmaxima) {
        this.velocidadmaxima = velocidadmaxima;
    }
    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String toString(){
        return ", velocidad actual:"+velocidadactual+"km/h, velocidad maxima:"+velocidadmaxima+"km/h )";
    }

}
