package agencia;

public class Vuelo {
    private int numero;
    private Ciudad ciudadSalida;
    private Ciudad ciudadLlegada;
    private int duracion;
    private int numeroSilla;
    private Silla listaSilla[];
    private Piloto piloto;
    public Vuelo(int numero, Ciudad ciudadSalida, Ciudad ciudadLlegada, int duracion, int numeroSilla, Piloto piloto) {
        this.numero = numero;
        this.ciudadSalida = ciudadSalida;
        this.ciudadLlegada = ciudadLlegada;
        this.duracion = duracion;
        this.numeroSilla = numeroSilla;
        this.listaSilla =new Silla[numeroSilla];
        this.piloto = piloto;
    }

    public void asignarSilla(Silla silla){
        for (int i = 0; i < listaSilla.length; i++) {
            if(listaSilla[i] == null){
                listaSilla[i] = silla;
                break;
            }
        }
    }
    public Silla buscarPasajero(int id){
        for (Silla silla : listaSilla) {
            if (silla.getPasajero().getId() == id) {
                return silla;
            }
        }
    return null;
    }
    public int getNumero() {
    return numero;
    }
    public void setNumero(int numero) {
    this.numero = numero;
    }
    public Ciudad getCiudadSalida() {
    return ciudadSalida;
    }
    public void setCiudadSalida(Ciudad ciudadSalida) {
    this.ciudadSalida = ciudadSalida;
    }
    public Ciudad getCiudadLlegada() {
    return ciudadLlegada;
    }
    public void setCiudadLlegada(Ciudad ciudadLlegada) {
    this.ciudadLlegada = ciudadLlegada;
    }
    public int getDuracion() {
    return duracion;
    }
    public void setDuracion(int duracion) {
    this.duracion = duracion;
    }
    public int getNumeroSilla() {
    return numeroSilla;
    }
    public void setNumeroSilla(int numeroSilla) {
    this.numeroSilla = numeroSilla;
    }
    public Silla[] getListaSilla() {
    return listaSilla;
    }
    public void setListaSilla(Silla[] listaSilla) {
    this.listaSilla = listaSilla;
    }
    public Piloto getPiloto() {
    return piloto;
    }
    public void setPiloto(Piloto piloto) {
    this.piloto = piloto;
    }
    @Override
    public String toString() {
    return "Vuelo numero " + numero + " CiudadSalida " + ciudadSalida + " CiudadLlegada " + ciudadLlegada + " Duracion=" + duracion + " Piloto=" + piloto + "]";
    }

}