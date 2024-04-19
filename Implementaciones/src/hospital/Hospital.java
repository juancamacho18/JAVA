package hospital;

import java.util.ArrayList;

public class Hospital {
    private String nombre;
    private String direccion;
    private int numero;
    private ArrayList<Sala> listasalas;
    private ArrayList<Medico> listamedicos;
    public Hospital(){
        nombre="Hospital de emergencias";
        direccion="carrera 24a #118-29";
        numero=4401844;
        this.listasalas=new ArrayList<>();
        this.listamedicos=new ArrayList<>();
    }
    public void agregarSala(Sala sala) {
        listasalas.add(sala);
    }

    public void eliminarSala(Sala sala) {
        listasalas.remove(sala);
    }

    public ArrayList<Sala> getSalas() {
        return listasalas;
    }

    // Métodos para la gestión de médicos
    public void agregarMedico(Medico medico) {
        listamedicos.add(medico);
    }

    public void eliminarMedico(Medico medico) {
        listamedicos.remove(medico);
    }

    public void mostrarSalas(){
        for (Sala salas: listasalas)
        System.out.println(salas);
    }

    public void mostrarMedicoss(){
        for (Medico medicos: listamedicos)
        System.out.println(medicos);
    }

    public ArrayList<Medico> getMedicos() {
        return listamedicos;
    }
    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return String return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
     * @return ArrayList<Sala> return the listasalas
     */
    public ArrayList<Sala> getListasalas() {
        return listasalas;
    }

    /**
     * @param listasalas the listasalas to set
     */
    public void setListasalas(ArrayList<Sala> listasalas) {
        this.listasalas = listasalas;
    }

    /**
     * @return ArrayList<Medico> return the listamedicos
     */
    public ArrayList<Medico> getListamedicos() {
        return listamedicos;
    }

    /**
     * @param listamedicos the listamedicos to set
     */
    public void setListamedicos(ArrayList<Medico> listamedicos) {
        this.listamedicos = listamedicos;
    }

}
