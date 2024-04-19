package electrodomestico;

public class Electrodomestico {
    protected int codigo;
    protected String marca;
    protected String modelo;
    protected int precio;
    public Electrodomestico (int codigo, String marca, String modelo, int precio){
        this.codigo=codigo;
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
    }
    public int calcularPrecio(int cantidad){
        return cantidad * precio;
    }
    /**
     * @return String return the codigo
     */
    public int getCodigo() {
        return codigo;
    }
    /**
     * @param marca the marca to set
     */
    public void setCodigo(int codigo) {
        this.codigo=codigo;
    }
    /**
     * @return String return the marca
     */
    public String getMarca() {
        return marca;
    }
    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return String return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return int return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public String toString(){
        return "(codigo:"+codigo+", marca:"+marca+", modelo:"+modelo+", precio:$"+precio;
    }
    

}