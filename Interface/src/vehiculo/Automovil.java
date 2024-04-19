package vehiculo;

public class Automovil implements Vehiculo {
    private int velocidadactual;

    public Automovil(int velocidadactual) {
        this.velocidadactual = velocidadactual;
    }

    @Override
    public String acelerar(int dato) {
        velocidadactual+=dato;
        return "la velocidad actual del automovil es:"+velocidadactual+" km/h";
    }

    @Override
    public String frenar(int dato) {
        velocidadactual-=dato;
        return "la velocidad actual del automovil es:"+velocidadactual+" km/h";
    }

}