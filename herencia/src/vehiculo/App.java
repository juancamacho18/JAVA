package vehiculo;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Vehiculo> listavehiculos= new ArrayList<>();
        Terrestre terrestre1= new Terrestre(0, 50, new Motor(65, 4.5), 4, "militar");
        Terrestre terrestre2= new Terrestre(0, 50, new Motor(35, 8.0), 2, "civil");
        Acuatico acuatico1= new Acuatico(0, 50, new Motor(50, 12.2), 4, "submarino");
        Acuatico acuatico2= new Acuatico(0, 50, new Motor(25, 7.3), 2, "submarino");
        Acuatico acuatico3= new Acuatico(0, 50, new Motor(37, 2.0), 1, "superficie");
        listavehiculos.add(terrestre1);
        listavehiculos.add(terrestre2);
        listavehiculos.add(acuatico1);
        listavehiculos.add(acuatico2);
        listavehiculos.add(acuatico3);
        
        for (Vehiculo operaciones: listavehiculos){
            
            operaciones.acelerar(10.0);
            operaciones.frenar(20.0);
        }
        for (Vehiculo mostrar: listavehiculos){
            System.out.println(mostrar);
        }
    }
}
