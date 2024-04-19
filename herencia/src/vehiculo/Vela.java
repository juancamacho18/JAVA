package vehiculo;

import java.util.Scanner;

public class Vela {
    private double velocidadviento;
    Scanner leer= new Scanner(System.in);

    public int recomendarVelocidad(double velocidadviento){
        
        if (velocidadviento>80.0){
            return 0;
        }else if (velocidadviento<10.0){
            return 0;
        }else{
            return 100;
        }
    }
    /**
     * @return double return the velocidadviento
     */
    public double getVelocidadviento() {
        return velocidadviento;
    }

    /**
     * @param velocidadviento the velocidadviento to set
     */
    public void setVelocidadviento(double velocidadviento) {
        this.velocidadviento = velocidadviento;
    }

}
