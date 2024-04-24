package biblioteca;

public class Revista extends Publicacion{
    private int numero;
    private int periodicidad;
    public Revista(int codigo, String titulo, int añoPublicacion, String editorial, int numero, int periodicidad) {
        super(codigo, titulo, añoPublicacion, editorial);
        this.numero=numero;
        this.periodicidad=periodicidad;
    }

    public String toString(){
        return "REVISTA ("+super.toString()+", numero:"+numero+", periocidad:"+periodicidad+")";
    }

}
