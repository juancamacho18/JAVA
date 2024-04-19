package ejercicio2;

public class Noperecedero extends Producto {
    private int tipo;

    public Noperecedero(int codigo, String descripcion, double precio, int tipo) {
        super(codigo, descripcion, precio);
        this.tipo = tipo;
        comprobartipo();
    }
    @Override
    public void calcularpreciodeventa() {
        if (tipo==1){
            precio+=(precio*0.03);
        }else if(tipo==2){
            precio+=(precio*0.02);
        }else if(tipo==3){
            precio+=(precio*0.01);
        }
    }

    private void comprobartipo(){
        if (tipo>2){
            tipo=1;
        }
    }
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return super.toString()+", tipo:"+tipo+")";
    }

    

}