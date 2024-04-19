package biblioteca;

public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca= new Biblioteca();
        System.out.println("BIENVENIDO A LA BIBLIOTECA");
        System.out.println("VEA EL CATALOGO:");
        biblioteca.crearLibrosyrevistas();
        biblioteca.mostrarLibros();
        biblioteca.mostrarRevistas();
        biblioteca.prestarLibro();
        System.out.println("VEA EL CATALOGO: ");
        biblioteca.mostrarLibros();
    }
}
