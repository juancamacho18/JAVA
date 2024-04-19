package biblioteca;
import java.time.LocalDate;

public class Libro {
    private int isbn;
    private String titulo;
    private int edicion;
    private Autor autor;
    private Editorial editorial;
    private int paginas;
    private boolean estado;
    private LocalDate fechaPrestamo;
    private LocalDate fechaEntrega;
    public Libro (int isbn, String titulo, int edicion, Autor autor, Editorial editorial, int paginas ){
        this.isbn=isbn;
        this.titulo=titulo;
        this.edicion=edicion;
        this.autor=autor;
        this.editorial=editorial;
        this.paginas=paginas;
    }
    /**
     * @return int return the isbn
     */
    public int getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(int isbn) {
        this.isbn = isbn;
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
     * @return int return the edicion
     */
    public int getEdicion() {
        return edicion;
    }

    /**
     * @param edicion the edicion to set
     */
    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    /**
     * @return Autor return the autor
     */
    public Autor getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    /**
     * @return Editorial return the editorial
     */
    public Editorial getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
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
    public boolean isEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * @return LocalDate return the fechaPrestamo
     */
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    /**
     * @param fechaPrestamo the fechaPrestamo to set
     */
    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    /**
     * @return LocalDate return the fechaEntrega
     */
    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * @param fechaEntrega the fechaEntrega to set
     */
    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    @Override
    public String toString() {
        String estado= this.estado ? "prestado": " ";
        return "Libro{ ISBN=" + isbn + ", Título='" + titulo + "', Autor=" + autor.getNombre() + ", Editorial=" + editorial.getNombre() + ", Número de páginas=" + paginas + ", estado="+estado+"} ";
    }
}
