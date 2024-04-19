package biblioteca;

public class Texto {
    protected int codigo;
    protected String titulo;
    protected int añoPublicacion;
    protected String editorial;
    public Texto (int codigo, String titulo, int añoPublicacion, String editorial){
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

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return String return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return LocalDate return the añoPublicacion
     */
    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    /**
     * @param añoPublicacion the añoPublicacion to set
     */
    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    /**
     * @return String return the editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public String toString(){
        return "codigo:"+codigo+", titulo:'"+titulo+"', año de publicacion:"+añoPublicacion+", editorial:"+editorial;
    }


}
