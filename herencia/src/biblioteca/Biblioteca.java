package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    ArrayList<Texto> textos=new ArrayList<>();
    Scanner leer= new Scanner(System.in);
    public void crearLibrosyrevistas(){
        Libro libro1= new Libro(1805473, "los viajes de amanda", 1995, "Casallas", "Rene Vaquez", 267, "DISPONIBLE");
        Libro libro2= new Libro(8353895, "hasta la muerte", 2002, "educa", "maria camila garzon", 422, "DISPONIBLE");
        Libro libro3= new Libro(2560102, "historias de la inteligencia artificial", 1998, "Sentillana", "Horacio Fernando Gomez", 289, "DISPONIBLE");
        Revista revista1= new Revista(19857, "novea", 2016, "summerhill", 22, "semanal");
        Revista revista2= new Revista(20917, "la cotidiana", 2024, "ediciones de lectura", 4, "mensual");
        Revista revista3= new Revista(38725, "chismoreo", 2000, "trevien", 52, "semanal");
        textos.add(libro1);
        textos.add(libro2);
        textos.add(libro3);
        textos.add(revista1);
        textos.add(revista2);
        textos.add(revista3);
    }
    public void prestarLibro(){
        System.out.println("'Prestamos'");
        System.out.println("ingrese el codigo del libro que quiere llevar:");
        int dato= leer.nextInt();
        for (Texto prestamo: textos){
            if (prestamo instanceof Libro){
                if (dato==prestamo.getCodigo()){
                    Libro libro=(Libro) prestamo;
                    if (libro.getEstado().equals("DISPONIBLE")){
                        libro.setEstado("PRESTADO");
                        System.out.println(libro);
                        System.out.println("libro prestado");
                    }
                }
            }
        }
    }
    public void mostrarLibros(){
        for (Texto listalibros: textos){
            if (listalibros instanceof Libro){
                System.out.println(listalibros);
            }
        }
    }
    public void mostrarRevistas(){
        for (Texto listarevistas: textos){
            if (listarevistas instanceof Revista){
                System.out.println(listarevistas);
            }
        }
    }
}
