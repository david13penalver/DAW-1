import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio4a {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Set<Integer> conjunto = new HashSet<>();
        int number;


        System.out.println("Introduce tamaño de la colección");
        int size = reader.nextInt();

        for (Integer i = 0; i < size; i++) {
            System.out.println("Introduce número para el conjnto:");
            number = reader.nextInt();
            conjunto.add(number);
        }

        System.out.println(conjunto);

    }

}
