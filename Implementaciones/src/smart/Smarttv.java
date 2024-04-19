package smart;

import java.util.ArrayList;
import java.util.Scanner;

public class Smarttv {
    private ArrayList<Pelicula> listaPeliculas;
    private Director director;
    private Productor productor;
    private Actor protagonista;
    private Pais pais;
    Scanner buscar= new Scanner(System.in);
    public Smarttv(){
        this.listaPeliculas=new ArrayList<>();
        director=new Director("Francis Ford", null);
        productor= new Productor("Francis Ford", null);
        protagonista= new Actor("Winona Ryder", pais, null);
    }
    public void crearPeliculas(){
        listaPeliculas.add(new Pelicula("Dracula, de Abram Stroker", director, productor, "Terror/Drama", 18, 1992, protagonista));
        listaPeliculas.add(new Pelicula("Star Wars", director=new Director("George Lucas", null), productor=new Productor("Gary Kurtz", null), "Ciencia ficiion", 12, 1977, protagonista=new Actor("Mark Hamill", pais=new Pais(0, "Americano"), null)));
        listaPeliculas.add(new Pelicula("Heathers", director=new Director("Michael Lehmann", null), productor=new Productor("Denisse Di Novi", null), "Comedia/crimen", 18, 1988, protagonista=new Actor("Winona Ryder", pais=new Pais(0, "Americana"), null)));
        listaPeliculas.add(new Pelicula("Como si fuera la primera vez", director=new Director("Peter Segal", null), productor=new Productor("Jack Giarraputo", null), "Comedia/romance", 10, 2004, protagonista=new Actor("Adam Sandler", pais=new Pais(0, "Americano"), null)));
        listaPeliculas.add(new Pelicula("Spider Man", director=new Director("Sam Raimi", null), productor=new Productor("Laura ziskin", null), "Accion/superheroes", 12, 2002, protagonista=new Actor("Tobey Maguire", pais=new Pais(0, "Americano"), null)));
        listaPeliculas.add(new Pelicula("Indiana Jones", director=new Director("George Lucas", null), productor=new Productor("Gary Kurtz", null), "Aventura", 12, 1981, protagonista=new Actor("Harrison Ford", pais=new Pais(0, "Americano"), null)));
    }
    public void mostrarPeliculas(){
        System.out.println("Peliculas online Smart TV");
        System.out.println("LISTA DE PELICULAS:");
        for (Pelicula pelicula:listaPeliculas){
            System.out.println(pelicula);
        }
    }
    public void buscarPelicula(){
        System.out.println("ingrese la pelicula que desea buscar(Director, Productor o Actor):");
        String busqueda=buscar.nextLine();
        System.out.println("resultados:");
        for (Pelicula pelicula: listaPeliculas){
            if (busqueda.equals(pelicula.getDirector().getNombre())){
                System.out.println(pelicula);
            }else if(busqueda.equals(pelicula.getProductor().getNombre())){
                System.out.println(pelicula);
            }else if(busqueda.equals(pelicula.getProtagonista().getNombre())){
                System.out.println(pelicula);
            }
        }
    }
}
