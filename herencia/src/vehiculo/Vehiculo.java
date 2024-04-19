package vehiculo;

public class Vehiculo {
    protected double velocidadactual;
    protected double velocidadmaxima;
    protected Motor motor;

    public Vehiculo (double velocidadactual, double velocidadmaxima, Motor motor){
        this.velocidadactual=velocidadactual;
        this.velocidadmaxima=velocidadmaxima;
        this.motor=motor;
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
    /**
     * @return Motor return the motor
     */
    public Motor getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setVelocidadmaxima(double velocidadmaxima) {
        this.velocidadmaxima = velocidadmaxima;
    }
    public String toString(){
        return ", motor:"+motor+", velocidad actual:"+velocidadactual+"km/h, velocidad maxima:"+velocidadmaxima+"km/h )";
    }

}
