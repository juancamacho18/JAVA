package agencia;

public class Agencia {
    private static Vuelo listaVuelo[];
    private static Ciudad ciudad1;
    private static Ciudad ciudad2;
    private static Piloto piloto;
    public static void main(String[] args) {
        listaVuelo =new Vuelo[4];
        ciudad1 =new Ciudad(100,"Bogota");
        ciudad2 =new Ciudad(200,"Cali");
        piloto =new Piloto("Juanita",600);
        listaVuelo[0] =new Vuelo(1000,ciudad1,ciudad2,30,10,piloto);
        listaVuelo[1] =new Vuelo(2000,ciudad2,ciudad1,40,10,piloto);
        Pasajero pasajero1 =new Pasajero(1000,"Pachita",30,"Mujer");
        Pasajero pasajero2 =new Pasajero(5000,"Francisco",50,"Hombre");
        Pasajero pasajero3 =new Pasajero(8000,"Albita",45,"Mujer");
        Silla silla1 =new Silla('A',100,pasajero1);
        Silla silla2 =new Silla('A',101,pasajero2);
        Silla silla3 =new Silla('A',102,pasajero3);
        listaVuelo[0].asignarSilla(silla1);
        listaVuelo[0].asignarSilla(silla2);
        listaVuelo[0].asignarSilla(silla3);
        System.out.println("LISTA DE PASAJEROS DE UN VUELO");
        for (Vuelo vuelo : listaVuelo) {
            if(vuelo == null){
                break;
            }else if (vuelo.getNumero() == 1000) {
                System.out.println(vuelo);
                for (Silla silla : vuelo.getListaSilla()) {
                    if (silla != null) {
                        System.out.println(silla);
                    }
                }
                break;
        }else{
                System.out.println("Numero de Vuelo no Existe");
            }
        }
        System.out.println("MUESTRA LOS DATOS DE UN PASAJEROS EN UN VUELO");
        for (Vuelo vuelo : listaVuelo) {
            if(vuelo==null){
                break;
            } else if (vuelo.getNumero() == 1000) {
                System.out.println(vuelo);
                for (Silla silla : vuelo.getListaSilla()) {
                    if (silla != null) {
                        if(silla.getPasajero().getId()==5000){
                            System.out.println(silla.getPasajero());
                            break;
                        }
                    }
                }
            }
        }
    }
}