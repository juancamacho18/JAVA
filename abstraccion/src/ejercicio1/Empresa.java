package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
    private static ArrayList<Empleado> listaEmpleado =new ArrayList<>(); 
    private static Scanner leer =new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        listaEmpleado.add(new Vendedor(1000,"Juanita",25,2020,2000000));
        listaEmpleado.add(new Repartidor(23456,"Pachito",20,2023,2,500));
        listaEmpleado.add(new Vendedor(38900,"Albita",35,2019,3000000));
        listaEmpleado.add(new Repartidor(27496,"Pachita",26,2021,10,600));
        listaEmpleado.add(new Vendedor(105090,"Juanito",45,2018,2000000));
        listaEmpleado.add(new Repartidor(28904,"Rosita",30,2017,3,800));

        //Buscar un empleado

        System.out.print("Ingrese el Id del empleado ");
        int id = leer.nextInt();

        boolean existe=false;
        
        for (Empleado empleado : listaEmpleado) {
            if (empleado.id == id ) {
                System.out.println(empleado);
                existe=true;
                break;
            }
        }
        if(!existe)
            System.out.println("Empleado no existe");

        System.out.println("LISTA DE EMPLEADOS");
        for (Empleado empleado : listaEmpleado) {
            System.out.println(empleado);
                        
        }


        
    }
}
