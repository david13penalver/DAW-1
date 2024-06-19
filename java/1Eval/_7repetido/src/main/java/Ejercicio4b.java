import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio4b {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Set<Integer> conjunto = new HashSet<>();
        int number;


        System.out.println("Introduce tamaño de la colección");

        do {
            System.out.println("Introduce número:");
            number = reader.nextInt();
            if (conjunto.contains(number)) {
                System.out.println("El número está repetido. No se añadirá.");
            } else {
                conjunto.add(number);
            }
        } while (number != 0);

        conjunto.remove(0);
        System.out.println(conjunto);

    }

}
