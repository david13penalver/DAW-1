import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio4d {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Set<Integer> conjuntoPar = new HashSet<>();
        Set<Integer> conjuntoImpar = new HashSet<>();

        int number;


        System.out.println("Introduce tamaño de la colección");

        do {
            System.out.println("Introduce número:");
            number = reader.nextInt();
            if (conjuntoPar.contains(number) || conjuntoImpar.contains(number)) {
                System.out.println("El número está repetido. No se añadirá.");
            } else {
                if (number % 2 == 0) {
                    conjuntoPar.add(number);
                } else {
                    conjuntoImpar.add(number);
                }
            }
        } while (number != 0);

        conjuntoPar.remove(0);
        System.out.println("Conjunto de números pares: " + conjuntoPar);
        System.out.println("Conjunto de números pares: " + conjuntoImpar);

    }

}
