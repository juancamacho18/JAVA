package ejercicio2;

public abstract class Producto {
    protected int codigo;
    protected String descripcion;
    protected double precio;

    public Producto (int codigo, String descripcion, double precio){
        this.codigo=codigo;
        this.descripcion=descripcion;
        this.precio=precio;
    }

    public abstract void calcularpreciodeventa();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto (codigo:"+codigo+", descripcion:"+descripcion+", precio:$"+precio;
    }

    
    
}