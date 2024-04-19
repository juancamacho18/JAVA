package biblioteca;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class Biblioteca {
        private ArrayList<Libro> listaLibros;
        private final int DIAS=5;
        private Autor autor;
        private Editorial editorial;
        private Pais pais;
        private Scanner scan = new Scanner(System.in);
    public Biblioteca() {
        this.listaLibros= new ArrayList<>();
        autor= new Autor("Jose Enrique Peña", pais);
        pais= new Pais(52, "Colombia");
        editorial= new Editorial(52, "Castellana", pais);
    }
    public void crearLibro(){
        listaLibros.add(new Libro(234567, "los viajes de amanda", 1, autor, editorial, 225));
        listaLibros.add(new Libro(382721, "cronica de una perdida", 2, new Autor("Alberto Gonzales", new Pais(64, "Mexico")), editorial, 304));
        listaLibros.add(new Libro(486152, "recetas para cocinar", 2, autor, editorial, 154));
        listaLibros.add(new Libro(195032, "apeirophobia", 1, autor, editorial, 258));
        listaLibros.add(new Libro(234567, "celos de una madre", 3, autor, editorial, 178));
        listaLibros.add(new Libro(252675, "el dolor de un recuerdo", 1, autor, editorial, 204));
    }
    public void prestamo(){
        System.out.println("ingrese codigo del libro: ");
        int codigo=scan.nextInt();
        for (Libro libro:listaLibros){
            if(libro.getIsbn()==codigo){
                if(libro.isEstado()){
                    System.out.println(libro+" Fecha de entrega "+libro.getFechaEntrega());
                    break;
                }else{
                    System.out.println(libro);
                    libro.setFechaPrestamo(LocalDate.now());
                    libro.setFechaEntrega(libro.getFechaPrestamo().plusDays(DIAS));
                    System.out.println("Fecha de prestamo: "+libro.getFechaPrestamo());
                    System.out.println("Fecha de entrega: "+libro.getFechaEntrega());
                    libro.setEstado(true);
                    break;
                }
            }
        };
    }
    public void informeLibrosPrestados(){
        System.out.println("BIBLIOTECA NACIONAL");
        System.out.println("LISTA DE LIBROS ");
        for (Libro libro: listaLibros){
            if(libro.isEstado()){
                System.out.println(libro+" "+libro.getFechaPrestamo()+" "+libro.getFechaEntrega()+" ");
            }else{
                System.out.println(libro);
            }
        }
    }
    
}