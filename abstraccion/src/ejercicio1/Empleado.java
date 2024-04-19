package ejercicio1;

public class Empleado {
    protected int id;
    protected String  nombre;
    protected int edad;
    protected int anioIngreso;
    protected final int SALARIOBASE =1300000;

    public Empleado(int id, String nombre, int edad, int anioIngreso) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.anioIngreso = anioIngreso;
    }



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "Id " + id + " Nombre=" + nombre + " Edad=" + edad + " Anio Ingreso " + anioIngreso + " Salario Base " + SALARIOBASE;
    }
 

}
