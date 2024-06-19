package haciendoTodo;

import java.util.ArrayList;
import java.util.List;

public class Flota {
    private List<Coche> cocheList = new ArrayList<>();

    public void fleetAddCar(Coche coche) {
        cocheList.add(coche);
    }
    public boolean removeCoche(int numBastidor){
        for (Coche coche: cocheList) {
            if(coche.getNumeroBastidor() == numBastidor) {
                cocheList.remove(coche);
                System.out.println("Se ha eliminado el coche con número de bastidor " + numBastidor);
                return true;
            }
        }
        return false;
    }
    public Coche buscarCoche(int numBastidor){
        for (Coche coche: cocheList) {
            if(coche.getNumeroBastidor() == numBastidor) {
                return coche;
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return "Flota{" +
                "cocheList=" + cocheList +
                '}';
    }
}
