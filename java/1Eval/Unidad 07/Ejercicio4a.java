import java.util.Scanner;
import java.util.Collection;
import java.util.HashSet;
class Ejercicio4a {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int size;
        int element;
        HashSet<Integer> collection = new HashSet<>();

        System.out.println("Introduce el tamaño del conjunto:");
        size = reader.nextInt();
        System.out.println("Tu conjunto tendrá un tamaño de " + size + " elemento(s).");

        for (int i = 0; i < size; i++) {
            System.out.println("Introduce el elemento de la posición" + (i + 1));
            element = reader.nextInt();
            collection.add(element);
        }

        System.out.println(collection);

    }
}