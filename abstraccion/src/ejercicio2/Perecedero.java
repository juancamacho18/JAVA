package ejercicio2;

public class Perecedero extends Producto {
    private int diasacaducar;

    public Perecedero(int codigo, String descripcion, double precio, int diasacaducar) {
        super(codigo, descripcion, precio);
        this.diasacaducar = diasacaducar;
    }

    @Override
    public void calcularpreciodeventa() {
        if (diasacaducar==1){
            precio-=(precio*4);
        }else if(diasacaducar==2){
            precio-=(precio*3);
        }else if(diasacaducar==3){
            precio-=(precio/2);
        }
    }
    public int getDiasacaducar() {
        return diasacaducar;
    }
    public void setDiasacaducar(int diasacaducar) {
        this.diasacaducar = diasacaducar;
    }

    @Override
    public String toString() {
        return super.toString()+", dias a caducar: "+diasacaducar+")";
    }

    

}