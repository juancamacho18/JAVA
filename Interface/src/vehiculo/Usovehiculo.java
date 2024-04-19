package vehiculo;

import java.util.ArrayList;

public class Usovehiculo {
    public static void main(String[] args) {
        ArrayList<Vehiculo> listavehiculos= new ArrayList<>();
        Moto moto1= new Moto(0);
        Moto moto2= new Moto(0);
        Automovil automovil1= new Automovil(0);
        Automovil automovil2= new Automovil(0);
        listavehiculos.add(moto1);
        listavehiculos.add(moto2);
        listavehiculos.add(automovil1);
        listavehiculos.add(automovil2);

        for (Vehiculo vehiculos: listavehiculos){
            if (vehiculos instanceof Moto){
                Moto moto= (Moto) vehiculos;
                System.out.println(moto.acelerar(50));
                System.out.println(moto.frenar(50));
            }else{
                Automovil auto= (Automovil) vehiculos;
                System.out.println(auto.acelerar(50));
                System.out.println(auto.frenar(50));
            }
        }
    }
}