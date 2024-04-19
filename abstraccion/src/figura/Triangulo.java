package figura;

public class Triangulo extends Figura{
    private int base;
    private int altura;

    public Triangulo (String color, int base, int altura){
        super(color);
        this.base=base;
        this.altura=altura;
    }
    @Override
    public double calcularArea() {
        return (base*altura)/4;
    }
    @Override
    public double calcularPerimetro() {
        return base+altura*2;
    }


}