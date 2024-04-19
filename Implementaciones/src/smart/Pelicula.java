package smart;

public class Pelicula {
    private String titulo;
    private Director director;
    private Productor productor;
    private String genero;
    private int clasificacion;
    private int anio;
    private Actor protagonista;
    public Pelicula(String titulo, Director director, Productor productor, String genero, int clasificacion, int anio, Actor protagonista){
        this.titulo=titulo;
        this.director=director;
        this.productor=productor;
        this.genero=genero;
        this.clasificacion=clasificacion;
        this.anio=anio;
        this.protagonista=protagonista;
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
     * @return Director return the director
     */
    public Director getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(Director director) {
        this.director = director;
    }

    /**
     * @return Productor return the productor
     */
    public Productor getProductor() {
        return productor;
    }

    /**
     * @param productor the productor to set
     */
    public void setProductor(Productor productor) {
        this.productor = productor;
    }

    /**
     * @return String return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return int return the clasificacion
     */
    public int getClasificacion() {
        return clasificacion;
    }

    /**
     * @param clasificacion the clasificacion to set
     */
    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    /**
     * @return int return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * @return Actor return the protagonista
     */
    public Actor getProtagonista() {
        return protagonista;
    }

    /**
     * @param protagonista the protagonista to set
     */
    public void setProtagonista(Actor protagonista) {
        this.protagonista = protagonista;
    }
    public String toString(){
        return "-(titulo:'"+titulo+"', director:"+director.getNombre()+", productor:"+productor.getNombre()+", género:"+genero+", clasificación:"+clasificacion+", año:"+anio+", actor/protagonista:"+protagonista.getNombre()+")";
    }
}
