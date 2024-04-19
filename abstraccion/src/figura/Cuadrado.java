package figura;

public class Cuadrado extends Figura{
    private int lado;

    public Cuadrado (String color, int lado){
        super(color);
        this.lado=lado;

    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public double calcularPerimetro() {
        return lado*4;
    }
}