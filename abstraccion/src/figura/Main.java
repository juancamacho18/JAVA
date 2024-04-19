package figura;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado= new Cuadrado("negro", 5);
        Triangulo triangulo= new Triangulo("verde", 4, 5);
        
        System.out.println("Cuadrado (color:"+cuadrado.getColor()+", area:"+cuadrado.calcularArea()+", perimetro:"+cuadrado.calcularPerimetro()+")");
        System.out.println("Triangulo (color:"+triangulo.getColor()+", area:"+triangulo.calcularArea()+", perimetro:"+triangulo.calcularPerimetro()+")");
    }
}