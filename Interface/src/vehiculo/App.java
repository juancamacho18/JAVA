package vehiculo;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Vehiculo> listavehiculos= new ArrayList<>();
        Terrestre terrestre1= new Terrestre(20, 0, 65, 5.7, 8, "militar");
        Terrestre terrestre2= new Terrestre(35, 0, 57, 7.0, 4, "civil");
        Acuatico acuatico1=new Acuatico(10, 0, 20, 8.2, 2, "superficie", 81); 
        Acuatico acuatico2=new Acuatico(20, 0, 14, 5.5, 4, "submarino", 75); 
        Acuatico acuatico3=new Acuatico(15, 0, 23, 10.0, 5, "submarino", 90); 
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
