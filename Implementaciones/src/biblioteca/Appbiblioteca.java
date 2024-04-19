package biblioteca;

public class Appbiblioteca {
    public static void main(String[]args){
    Biblioteca biblioteca= new Biblioteca();
    biblioteca.crearLibro();
    biblioteca.informeLibrosPrestados();
    biblioteca.prestamo();
    biblioteca.informeLibrosPrestados();
    }
}