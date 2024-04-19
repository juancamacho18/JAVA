package electrodomestico;

public class Lavadora extends Electrodomestico{
    private int carga;
    public Lavadora(int codigo, String marca, String modelo, int precio, int carga) {
        super(codigo, marca, modelo, precio);
        this.carga=carga;
    }
    /**
     * @return int return the carga
     */
    public int getCarga() {
        return carga;
    }

    /**
     * @param carga the carga to set
     */
    public void setCarga(int carga) {
        this.carga = carga;
    }
    public String toString(){
        return "LAVADORA "+super.toString()+", carga:"+carga+")";
    }
}
