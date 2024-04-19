package vehiculo;

public class Acuatico extends Vehiculo{
    private int pasajeros;
    private String tipo;
    private Vela vela;

    public Acuatico(double velocidadactual, double velocidadmaxima, Motor motor, int pasajeros, String tipo){
        super (velocidadactual, velocidadmaxima, motor);
        this.pasajeros=pasajeros;
        this.tipo=tipo;
        this.motor=motor;
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
    /**
     * @return Vela return the vela
     */
    public Vela getVela() {
        return vela;
    }

    /**
     * @param vela the vela to set
     */
    public void setVela(Vela vela) {
        this.vela = vela;
    }

    public String toString(){
        return "VEHICULO ACUATICO(tipo:"+getTipo()+", capacidad de pasajeros:"+getPasajeros()+super.toString();
    }
}
