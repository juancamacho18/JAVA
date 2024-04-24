package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        boolean error=false;
        ArrayList<Publicacion> listaPublicaciones=new ArrayList<>();
        Scanner scan= new Scanner(System.in);
        System.out.println("BIENVENIDO A LA BIBLIOTECA");
        Libro libro1= new Libro(1805473, "los viajes de amanda", 1995, "Casallas", "Rene Vaquez", 267);
        Libro libro2= new Libro(8353895, "hasta la muerte", 2002, "educa", "maria camila garzon", 422);
        Libro libro3= new Libro(2560102, "historias de la inteligencia artificial", 1998, "Sentillana", "Horacio Fernando Gomez", 289);
        Revista revista1= new Revista(19857, "novea", 2016, "summerhill", 22, 4);
        Revista revista2= new Revista(20917, "la cotidiana", 2024, "ediciones de lectura", 4, 2);
        Revista revista3= new Revista(38725, "chismoreo", 2000, "trevien", 52, 4);
        listaPublicaciones.add(libro1);
        listaPublicaciones.add(libro2);
        listaPublicaciones.add(libro3);
        listaPublicaciones.add(revista1);
        listaPublicaciones.add(revista2);
        listaPublicaciones.add(revista3);
        System.out.println("BIBLIOTECA LA QUINTA");
        for (Publicacion mostrar:listaPublicaciones){
            System.out.println(mostrar);
        }
        System.out.println("ingrese el codigo del libro que quiere llevar:");
        int dato= scan.nextInt();
        for (Publicacion prestamo: listaPublicaciones){
            if (prestamo instanceof Libro){
                Libro libro=(Libro)prestamo;
                if (dato==libro.getCodigo()){
                        libro.prestar();
                        System.out.println(libro);
                        error=true;
                        break;
                    }
                }
            }
            if (!error){
                System.out.println("libro no ecnontrado");
            }
        }
    }
