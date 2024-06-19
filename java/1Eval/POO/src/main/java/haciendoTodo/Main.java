package haciendoTodo;

public class Main {
    public static void main(String[] args) {

        Coche coche1 = new Coche("Ford", "Mustang", "azul eléctrico", 13);
        Coche coche2 = new Coche("Toyota", "GR Supra", "rojo", 11);
        Coche coche3 = new Coche("Toyota", "GR Yaris", "amarillo", 1);

        System.out.println("Mi coche es un " + coche1.getMarca() + " " + coche1.getModelo() + " de color " + coche1.getColor()
                + " con número de bastidor " + coche1.getNumeroBastidor());
        System.out.println(coche1);
        System.out.println(coche1.increaseSpeed(100) + " " + coche1.decreaseSpeed(98) + " " + coche1.decreaseSpeed(10));

        Flota flota1 = new Flota();
        flota1.fleetAddCar(coche1);
        flota1.fleetAddCar(coche2);
        flota1.fleetAddCar(coche3);
        System.out.println(flota1);
        flota1.removeCoche(11);
        System.out.println(flota1);
    }
}
