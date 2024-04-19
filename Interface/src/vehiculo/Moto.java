package vehiculo;

public class Moto implements Vehiculo{
    private int velocidadactual;

    public Moto(int velocidadactual) {
        this.velocidadactual = velocidadactual;
    }
    @Override
    public String acelerar(int dato) {
        velocidadactual+=dato;
        return "la velocidad actual de la moto es:"+velocidadactual+" km/h";
    }

    @Override
    public String frenar(int dato) {
        velocidadactual-=dato;
        return"la velocidad actual de la moto es:"+velocidadactual+" km/h";
    }

    
    
}