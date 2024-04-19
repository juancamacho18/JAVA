package hospital;

public class Cama {
    private Paciente paciente;
    private boolean ocupada;
    public Cama(Paciente paciente){
        this.paciente=paciente;
    }
    /**
     * @return Paciente return the paciente
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * @return boolean return the ocupada
     */
    public boolean isOcupada() {
        return ocupada;
    }

    /**
     * @param ocupada the ocupada to set
     */
    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public String toString(){
        return "Paciente=("+paciente.getNombre()+", cedula="+paciente.getCedula()+", direccion="+paciente.getDireccion()+", fecha de nacimiento="+paciente.getFecha()+")";
    }

}

