package ejercicio1;

public class Repartidor extends Empleado{
    private int zona;
    private long acumuladoReparto;
    private final int VALORREPARTO = 10000;

    public Repartidor(int id, String nombre, int edad, int anioIngreso, int zona, long acumuladoReparto) {
        super(id, nombre, edad, anioIngreso);
        this.acumuladoReparto = acumuladoReparto;

        comprobadorZona(zona);
    }
    /**
     * Función comprobador de zona
     * @param zona
     */
    private void comprobadorZona(int zona){
        if(zona >= 1 && zona <= 5)
            this.zona = zona;
        else
            this.zona = 1;

    }
    @Override
    public String toString() {
        return "Repartidor "+super.toString()+" Zona" + zona + " Acumulado Reparto " + acumuladoReparto + " Valor Reparto " + VALORREPARTO+"\n";
    }

    

}
