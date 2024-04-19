package hospital;

import java.util.ArrayList;

public class Sala {
    private int numero;
    private int cantidadcamasocupadas;
    private int capacidadmaxima;
    private ArrayList<Cama> camas;
    public Sala(int numero, int cantidadcamasocupadas, int capacidadmaxima){
        this.numero=numero;
        this.cantidadcamasocupadas=cantidadcamasocupadas;
        this.capacidadmaxima=capacidadmaxima;
        this.camas=new ArrayList<>();
    }
    /**
     * @return int return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return ArrayList<Cama> return the camas
     */
    public ArrayList<Cama> getCamas() {
        return camas;
    }

    /**
     * @param camas the camas to set
     */
    public void agregarPaciente(Paciente paciente){
        if (camas.size()<capacidadmaxima){
            camas.add(new Cama(paciente));
            cantidadcamasocupadas++;
        }else{
            System.out.println("la sala esta llena");
        }
    }
    public void setCamas(ArrayList<Cama> camas) {
        this.camas = camas;
    }
    public void mostrarCamas(){
        for (Cama listacamas: camas){
            System.out.println(listacamas);
        }
    }
    public String toString(){
        return "Sala #" + numero + ": Camas ocupadas=" + cantidadcamasocupadas + ", Camas en total=" + capacidadmaxima;
    }
}
