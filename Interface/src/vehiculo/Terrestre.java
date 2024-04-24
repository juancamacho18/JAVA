package vehiculo;

public class Terrestre extends Vehiculo implements Motor{
    private int llantas;
    private String usodelvehiculo;

    public Terrestre(double velocidadactual, double velocidadmaxima, int fuerza, double radio, int llantas, String usodelvehiculo){
        super (velocidadactual, velocidadmaxima, fuerza, radio);
        this.llantas=llantas;
        this.usodelvehiculo=usodelvehiculo;
        this.fuerza=fuerza;
        this.radio=radio;
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
    @Override
    public double revoluciones() {
        return fuerza*radio;
    }
    public String toString(){
        return "VEHICULO TERRESTRE (uso del vehiculo: "+getUsodelvehiculo()+", cantidad de llantas:"+getLlantas()+", motor:"+revoluciones()+"r.p.m "+super.toString();
    }


}
