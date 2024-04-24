package biblioteca;

public class Libro extends Publicacion implements Interface{
    private String autor;
    private int paginas;
    private boolean prestado;
    public Libro(int codigo, String titulo, int añoPublicacion, String editorial, String autor, int paginas){
        super(codigo, titulo, añoPublicacion, editorial);
        this.autor=autor;
        this.paginas=paginas;
    }
    @Override
    public void prestar() {
        this.prestado=true;
    }
    public String toString(){
        String estado;
        estado= prestado ? "prestado" : "disponible";
        return "LIBRO ("+super.toString()+", autor:"+autor+", paginas:"+paginas+", estado:"+estado+")";
    }
}
