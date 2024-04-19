package figura;

public class Circulo extends Figura {
    private int radio;

    public Circulo (String color, int radio){
        super(color);
        this.radio=radio;
    }
    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*radio;
    }

}