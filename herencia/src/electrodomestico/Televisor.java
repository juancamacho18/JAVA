package electrodomestico;

public class Televisor extends Electrodomestico {
    private int sintonizador;
    public Televisor(int codigo, String marca, String modelo, int precio, int sintonizador) {
        super(codigo, marca, modelo, precio);
        this.sintonizador=sintonizador;
    }
    /**
     * @return int return the sintonizador
     */
    public int getSintonizador() {
        return sintonizador;
    }
    
    /**
     * @param sintonizador the sintonizador to set
     */
    public void setSintonizador(int sintonizador) {
        this.sintonizador = sintonizador;
    }
    public String toString(){
        return "TELEVISOR "+super.toString()+", sintonizador:"+sintonizador+")";
    }
    }
