import java.util.ArrayList;
import java.util.List;
import java.lang.*;
import java.util.Scanner;


public class Flota {
    Scanner reader = new Scanner(System.in);

    List<Coche> fleetCars = new ArrayList<>();

    public void setFleetedCar(Coche coche) {
        fleetCars.add(coche);
    }

    public boolean setUnfleetedCar (int bastidor) {
        for (Coche coche : fleetCars) {
            if (bastidor == coche.getNumeroBastidor()) {
                fleetCars.remove(coche);
                System.out.println("Eliminado el coche con nº de bastidor " + bastidor + ".");
                return true;
            } else {
                System.out.println("El coche con dicho número de bastidor no existe.");
                return false;
            }
        }
        return false;
    }

    public void getFleetCars() {
        for (Coche coche : fleetCars) {
            //return coche.getMarca() + " " + coche.getModelo() + " " + coche.getColor() + " con nº " + coche.getNumeroBastidor();
            System.out.println(coche.getMarca() + " " + coche.getModelo() + " " + coche.getColor() + " con nº " +
                    coche.getNumeroBastidor() + ".");
        }
        //return ".";
    }

    public String toString() {
        for (Coche coche : fleetCars) {
            System.out.println("Coche: " + coche.getMarca() + " " + coche.getModelo() + " " + coche.getColor() + " con nº " + coche.getNumeroBastidor() + ".");;
        }
        return "";
    }

    public Coche buscarCoche(int numeroBastidor) {
        for (Coche coche : fleetCars) {
            if (coche.getNumeroBastidor() == numeroBastidor) {
                return coche;
            }
        }
        return null; // Devuelve null si no encuentra el coche
    }
}
