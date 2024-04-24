package biblioteca;

public class Publicacion {
    protected int codigo;
    protected String titulo;
    protected int añoPublicacion;
    protected String editorial;
    public Publicacion (int codigo, String titulo, int añoPublicacion, String editorial){
        this.codigo=codigo;
        this.titulo=titulo;
        this.añoPublicacion=añoPublicacion;
        this.editorial= editorial;
    }
    /**
     * @return int return the codigo
     */
    public int getCodigo() {
        return codigo;
    }
    public String toString(){
        return "codigo:"+codigo+", titulo:'"+titulo+"', año de publicacion:"+añoPublicacion+", editorial:"+editorial;
    }
}
