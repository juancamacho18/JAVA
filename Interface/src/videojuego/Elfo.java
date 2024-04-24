package videojuego;

public class Elfo extends Personaje implements Estadisticas {
    private String arma;
    private int daño;

    
    public Elfo(String nombre, int salud, int nivel, String arma) {
        super(nombre, salud, nivel);
        this.arma = arma;
    }

    /**
     * @return String return the arma
     */
    public String getArma() {
        return arma;
    }

    /**
     * @param arma the arma to set
     */
    public void setArma(String arma) {
        this.arma = arma;
    }
    @Override
    public void atacar() {
        if (arma=="cuchillo"){
            daño=25;
        }else if (arma=="espada"){
            daño=50;
        }else{
            daño=15;
        }
    }
    @Override
    public void subirnivel() {
        if (salud>30){
            nivel+=15;
        }else{
            nivel+=10;
        }
    }
    @Override
    public String toString() {
        return "Elfo (" +super.toString()+", arma:"+arma+", daño:"+daño+")";
    }

    
    

}
