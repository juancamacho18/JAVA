package biblioteca;

import java.util.Scanner;

public class Articulo extends Texto implements Interface{
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
        boolean error=false;
        System.out.println("'Prestamos'");
        System.out.println("ingrese el codigo del articulo que quiere llevar:");
        int dato= entrar.nextInt();
        if (dato==getCodigo()){
            if (getEstado().equals("DISPONIBLE")){
                    setEstado("PRESTADO");
                }
            error=true;
            }
        if (!error){
            System.out.println("articulo no encontrado");
        }
        
    }
    @Override
    public String toString() {
        return "Articulo ("+super.toString()+", estado:"+estado+")";
    }

    

}
