package vehiculo;

public class Terrestre extends Vehiculo{
    private int llantas;
    private String usodelvehiculo;

    public Terrestre(double velocidadactual, double velocidadmaxima, Motor motor, int llantas, String usodelvehiculo){
        super (velocidadactual, velocidadmaxima, motor);
        this.llantas=llantas;
        this.usodelvehiculo=usodelvehiculo;
        this.motor=motor;
    }
    /**
     * @return int return the llantas
     */
    public int getLlantas() {
        return llantas;
    }

    /**
     * @param llantas the llantas to set
     */
    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    /**
     * @return String return the usodelvehiculo
     */
    public String getUsodelvehiculo() {
        return usodelvehiculo;
    }

    /**
     * @param usodelvehiculo the usodelvehiculo to set
     */
    public void setUsodelvehiculo(String usodelvehiculo) {
        this.usodelvehiculo = usodelvehiculo;
    }
    public String toString(){
        return "VEHICULO TERRESTRE (uso del vehiculo: "+getUsodelvehiculo()+", cantidad de llantas:"+getLlantas()+super.toString();
    }

}
