package figura;

public abstract class Figura {
    private String color;

    public Figura(String color){
        this.color=color;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    /**
     * @return String return the color
     */
    public String getColor() {
        return color;
    }

}