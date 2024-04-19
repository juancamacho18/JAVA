package electrodomestico;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        ArrayList<Electrodomestico> electrodomestico= new ArrayList<>();
        try (Scanner lectura = new Scanner(System.in)) {
            Televisor televisor1=new Televisor(195032, "Challenger", "43LO69", 949900, 1);
            Televisor televisor2=new Televisor(329152, "Samsung", "40T5290", 918900, 1);
            Lavadora lavadora1= new Lavadora(227183, "MABE", "LMA8120WDGAB0", 1849900, 18);
            Lavadora lavadora2= new Lavadora(145226, "LG", "WT18MV6", 1959900, 18);
            electrodomestico.add(televisor1);
            electrodomestico.add(televisor2);
            electrodomestico.add(lavadora1);
            electrodomestico.add(lavadora2);
            for (Electrodomestico lista: electrodomestico){
                System.out.println(lista);
            }
            System.out.println("Ingrese el codigo del electrodomestico");
            int dato=lectura.nextInt();
            for (Electrodomestico electrodomesticos:electrodomestico){
                if(electrodomesticos.getCodigo()==dato){
                    System.out.println(electrodomesticos);
                    System.out.println("cuantos quiere comprar ?");
                    int cantidad=lectura.nextInt();
                    int total=electrodomesticos.calcularPrecio(cantidad);
                    System.out.println("total a pagar: $"+total);
                }
            }
        }
    }
}
