package videojuego;

public class Mago extends Personaje implements Estadisticas {
    private String poder;
    private int efectividad;
    public Mago(String nombre, int salud, int nivel, String poder) {
        super(nombre, salud, nivel);
        this.poder = poder;
    }
    public String getPoder() {
        return poder;
    }
    public void setPoder(String poder) {
        this.poder = poder;
    }
    @Override
    public void atacar() {
        if(poder=="Rayo"){
            efectividad=14;
        }else if (poder=="maldicion"){
            efectividad=21;
        }else{
            efectividad=5;
        }
        
    }
    @Override
    public void subirnivel() {
        if (salud>50){
            nivel+=32;
        }else{
            nivel+=20;
        }
        
    }
    @Override
    public String toString() {
        return "Mago (" +super.toString()+", poder:"+poder+", efectividad:"+efectividad+")";
    }
    
    

    

}
