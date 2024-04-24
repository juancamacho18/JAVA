package videojuego;

import java.util.ArrayList;

public class Videojuego {
    public static void main(String[] args) {
        ArrayList<Personaje> listapersonajes= new ArrayList<>();
        Mago mago1=new Mago("Baltazar", 85, 0, "maldicion");
        Mago mago2=new Mago("Gandalf", 50, 0, "trueno");
        Elfo elfo1=new Elfo("garve", 34, 0, "cuchillo");
        Elfo elfo2=new Elfo("smek", 28, 0, "espada");
        listapersonajes.add(mago1);
        listapersonajes.add(mago2);
        listapersonajes.add(elfo1);
        listapersonajes.add(elfo2);
        System.out.println("leyenda del medieval");
        System.out.println("personajes:");
        for (Personaje personaje: listapersonajes){
            if (personaje instanceof Elfo){
                Elfo elfo=(Elfo) personaje;
                elfo.atacar();
                elfo.subirnivel();
                System.out.println(elfo);
            }else{
                Mago mago=(Mago) personaje;
                mago.atacar();
                mago.subirnivel();
                System.out.println(mago);
            }
        }
    }
}
