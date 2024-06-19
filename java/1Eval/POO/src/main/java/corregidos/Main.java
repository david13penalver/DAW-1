package corregidos;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Opel", "Corsa", "amarillo", 1234);
        Coche coche2 = new Coche("Opel", "Astra", "gris", 5678);
        Coche coche3 = new Coche("Toyota", "GR Yaris", "rojo", 9012);

        System.out.println("Mostrando coche 1:");
        System.out.println(coche1);

        Flota flota1 = new Flota();
        flota1.addCoche(coche1);
        flota1.addCoche(coche2);
        flota1.addCoche(coche3);
        System.out.println("Mostrando flota 1:");
        flota1.showCocheList();
        flota1.removeCoche(5678);
        System.out.println("Mostrar flota 1 con coche 2 eliminado:");
        flota1.showCocheList();

        Conductor conductor1 = new Conductor("Pepe");
        conductor1.asignarCoche(1234, flota1);
        System.out.println(conductor1);


    }
}
