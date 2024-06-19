import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Coche car1 = new Coche();
        car1.setMarca("Opel");
        car1.setModelo("Corsa");
        car1.setColor("amarillo");
        car1.setNumeroBastidor(11);

        Coche car2 = new Coche();
        car2.setMarca("Toyota");
        car2.setModelo("GR Yaris");
        car2.setColor("rojo");
        car2.setNumeroBastidor(13);

        Coche car3 = new Coche();
        car3.setMarca("Nissan");
        car3.setModelo("Skyline R34");
        car3.setColor("azul");
        car3.setNumeroBastidor(57);

        System.out.println("Mi coche es un " + car2.getMarca() + " " + car2.getModelo() + " de color " + car2.getColor() +
                " con número de bastidor " + car2.getNumeroBastidor() + ".");
        System.out.println(car3.toString(car3));

        System.out.println("Velocidad del coche 1:" + car1.accelerateCar(16));
        System.out.println("Velocidad del coche 1:" + car1.decelerateCar(10));

        Flota fleetCars = new Flota();
        fleetCars.setFleetedCar(car1);
        fleetCars.setFleetedCar(car2);
        fleetCars.setFleetedCar(car3);

        System.out.println();
        System.out.println("Listado de coches de la flota:");
        //System.out.println(fleetCars.getFleetCars());
        fleetCars.getFleetCars();

        System.out.println();
        System.out.println("Eliminando coche con nº de bastidor 11:");
        fleetCars.setUnfleetedCar(11);
        System.out.println();
        System.out.println("Eliminando coche con nº de bastidor 10:");
        fleetCars.setUnfleetedCar(10);

        System.out.println();
        fleetCars.getFleetCars();

        System.out.println();
        System.out.println("Mostrando coches con toString():");
        System.out.println(fleetCars.toString());

        System.out.println(Singleton.getInstance().SingletonMethod());
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1);
        System.out.println(Singleton.checkInstance());
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2);
        System.out.println(Singleton.checkInstance());
        Singleton singleton3 = Singleton.getInstance();
        System.out.println(singleton3);
        System.out.println(Singleton.checkInstance());

        GeneradorId g1 = GeneradorId.getInstance();
        GeneradorId g2 = GeneradorId.getInstance();
        System.out.println(g1.getUuid());
        System.out.println(g2.getUuid());
        System.out.println(g1);
        System.out.println(g2);



    }
}
