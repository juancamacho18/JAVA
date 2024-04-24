package vehiculo;

public class Acuatico extends Vehiculo implements Motor,Vela{
    private int pasajeros;
    private String tipo;
    private double velocidadviento;

    public Acuatico(double velocidadactual, double velocidadmaxima, int fuerza, double radio, int pasajeros, String tipo, double velocidadviento){
        super (velocidadactual, velocidadmaxima, fuerza, radio);
        this.pasajeros=pasajeros;
        this.tipo=tipo;
        this.velocidadviento=velocidadviento;;
    }
    /**
     * @return int return the pasajeros
     */
    public int getPasajeros() {
        return pasajeros;
    }

    /**
     * @param pasajeros the pasajeros to set
     */
    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    /**
     * @return String return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public double getVelocidadviento() {
        return velocidadviento;
    }
    public void setVelocidadviento(double velocidadviento) {
        this.velocidadviento = velocidadviento;
    }
    
    public String toString(){
        return "VEHICULO ACUATICO(tipo:"+getTipo()+", capacidad de pasajeros:"+getPasajeros()+", motor:"+revoluciones()+"r.p.m"+super.toString();
    }
    @Override
    public double revoluciones() {
        return fuerza*radio;
    }
    @Override
    public void recomendarVelocidad() {
        if (velocidadviento>80){
            velocidadactual=0;
        }
        
    }
}
