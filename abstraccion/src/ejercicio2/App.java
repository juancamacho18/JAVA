package ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        ArrayList<Producto> productos= new ArrayList<>();
        boolean estado=false;
        Perecedero perecedero1= new Perecedero(1950325, "papaya", 5000, 3);
        Perecedero perecedero2= new Perecedero(347123, "banana", 3500, 2);
        Perecedero perecedero3= new Perecedero(238142, "carne", 4500, 1);
        Noperecedero noperecedero1=new Noperecedero(927345, "aguacate", 2000, 3);
        Noperecedero noperecedero2=new Noperecedero(912601, "jamon", 3400, 3);
        Noperecedero noperecedero3=new Noperecedero(183420, "leche", 2500, 1);
        productos.add(perecedero1);
        productos.add(perecedero2);
        productos.add(perecedero3);
        productos.add(noperecedero1);
        productos.add(noperecedero2);
        productos.add(noperecedero3);

        System.out.println("QUE PRODUCTO DESEA LLEVAR ? INGRESE EL CODIGO");
        int dato=leer.nextInt();
        for (Producto listadeproductos: productos){
            if (dato==listadeproductos.getCodigo()){
                System.out.println("cuantos desea llevar? ");
                int cantidad=leer.nextInt();
                if (listadeproductos instanceof Perecedero){
                    Perecedero perecedero= (Perecedero) listadeproductos;
                    perecedero.calcularpreciodeventa();
                    System.out.println("total a pagar:$"+(perecedero.getPrecio()*cantidad));
                    estado=true;
                    break;
                }else{
                    Noperecedero noperecedero= (Noperecedero) listadeproductos;
                    noperecedero.calcularpreciodeventa();
                    System.out.println("total a pagar:$"+(noperecedero.getPrecio()*cantidad));
                    estado=true;
                    break;
                }
            }
        }
        if (!estado){
            System.out.println("el producto no existe");
        }
        System.out.println("PRODUCTOS PERECEDEROS");
        for (Producto catalogo1: productos){
            if (catalogo1 instanceof Perecedero){
                System.out.println(catalogo1);
            }
        }

        System.out.println("PRODUCTOS NOPERECEDEROS");
        for (Producto catalogo2: productos){
            if (catalogo2 instanceof Noperecedero){
                System.out.println(catalogo2);
            }
        }

    }
}