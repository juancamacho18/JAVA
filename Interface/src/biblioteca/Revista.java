package biblioteca;

public class Revista extends Texto{
    private int numero;
    private String periocidad;
    public Revista(int codigo, String titulo, int añoPublicacion, String editorial, int numero, String periocidad) {
        super(codigo, titulo, añoPublicacion, editorial);
        this.numero=numero;
        this.periocidad=periocidad;
    }
    /**
     * @return int return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return String return the periocidad
     */
    public String getPeriocidad() {
        return periocidad;
    }

    /**
     * @param periocidad the periocidad to set
     */
    public void setPeriocidad(String periocidad) {
        this.periocidad = periocidad;
    }
    
    public String toString(){
        return "REVISTA ("+super.toString()+", numero:"+numero+", periocidad:"+periocidad+")";
    }

}
