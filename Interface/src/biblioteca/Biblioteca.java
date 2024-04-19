package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    public static void main(String[] args) {
        ArrayList<Texto> listatextos=new ArrayList<>();
        System.out.println("BIENVENIDO A LA BIBLIOTECA");
        Libro libro1= new Libro(1805473, "los viajes de amanda", 1995, "Casallas", "Rene Vaquez", 267, "DISPONIBLE");
        Libro libro2= new Libro(8353895, "hasta la muerte", 2002, "educa", "maria camila garzon", 422, "DISPONIBLE");
        Libro libro3= new Libro(2560102, "historias de la inteligencia artificial", 1998, "Sentillana", "Horacio Fernando Gomez", 289, "DISPONIBLE");
        Revista revista1= new Revista(19857, "novea", 2016, "summerhill", 22, "semanal");
        Revista revista2= new Revista(20917, "la cotidiana", 2024, "ediciones de lectura", 4, "mensual");
        Revista revista3= new Revista(38725, "chismoreo", 2000, "trevien", 52, "semanal");
        Articulo articulo1= new Articulo(345682, "como llevar una dieta sana", 2008, "la norma", "DISPONIBLE");
        Articulo articulo2= new Articulo(98345, "los errores y problemas en la educacion", 2003, "faber", "DISPONIBLE");
        Articulo articulo3= new Articulo(273610, "porque los profesores son tan exigentes", 2018, "casallas", "DISPONIBLE");
        listatextos.add(libro1);
        listatextos.add(libro2);
        listatextos.add(libro3);
        listatextos.add(revista1);
        listatextos.add(revista2);
        listatextos.add(revista3);
        listatextos.add(articulo1);
        listatextos.add(articulo2);
        listatextos.add(articulo3);
    }
}
