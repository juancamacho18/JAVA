package biblioteca;

import java.util.Scanner;

public class Articulo extends Publicacion implements Interface{
    Scanner entrar= new Scanner(System.in);
    private String estado;
    public Articulo(int codigo, String titulo, int añoPublicacion, String editorial, String estado) {
        super(codigo, titulo, añoPublicacion, editorial);
        this.estado=estado;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public void prestar() {
        setEstado("PRESTADO");
    }
    @Override
    public String toString() {
        return "Articulo ("+super.toString()+", estado:"+estado+")";
    }

    

}
