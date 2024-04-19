package biblioteca;

import java.util.Scanner;

public class Libro extends Texto implements Interface{
    private String autor;
    private int paginas;
    private String estado;
    Scanner leer= new Scanner(System.in);
    public Libro(int codigo, String titulo, int añoPublicacion, String editorial, String autor, int paginas, String estado){
        super(codigo, titulo, añoPublicacion, editorial);
        this.autor=autor;
        this.paginas=paginas;
        this.estado=estado;
    }
    /**
     * @return String return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return int return the paginas
     */
    public int getPaginas() {
        return paginas;
    }

    /**
     * @param paginas the paginas to set
     */
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    /**
     * @return boolean return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    @Override
    public void prestar() {
        boolean error=false;
        System.out.println("'Prestamos'");
        System.out.println("ingrese el codigo del libro que quiere llevar:");
        int dato= leer.nextInt();
        if (dato==getCodigo()){
            if (getEstado().equals("DISPONIBLE")){
                    setEstado("PRESTADO");
                }
            error=true;
            toString();
            }
        if (!error){
            System.out.println("libro no encontrado");
        }
    }
    public String toString(){
        return "LIBRO ("+super.toString()+", autor:"+autor+", paginas:"+paginas+", estado:"+estado+")";
    }
}
