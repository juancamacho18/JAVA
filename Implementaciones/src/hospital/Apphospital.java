package hospital;

public class Apphospital {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Sala sala1 = new Sala(1, 2, 5); 
        Sala sala2 = new Sala(2, 1, 5); 

        hospital.agregarSala(sala1);
        hospital.agregarSala(sala2);

        Medico medico1 = new Medico(123456, "Dr. Juan", "Pediatría");
        Medico medico2 = new Medico(789012, "Dra. María", "Cirugía");
        hospital.agregarMedico(medico1);
        hospital.agregarMedico(medico2);

        hospital.mostrarSalas();
        hospital.mostrarMedicoss();
    }
}
