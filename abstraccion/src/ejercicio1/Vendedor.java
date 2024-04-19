package ejercicio1;

public class Vendedor extends Empleado{
    private final int COMISION=15;
    private long valorventa;

    public Vendedor(int id, String nombre, int edad, int anioIngreso, long valorventa) {
        super(id, nombre, edad, anioIngreso);
        this.valorventa = valorventa;
    }

    @Override
    public String toString() {
        return "Vendedor "+super.toString()+ " Comision " + COMISION + " Valor Venta " + valorventa+"\n";
    }

}
