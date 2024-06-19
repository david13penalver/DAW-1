import java.util.Scanner;
import java.util.Collection;
import java.util.HashSet;
class Ejercicio4c {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int size;
        int element;
        HashSet<Integer> collection = new HashSet<>();

        

        do {
            element = reader.nextInt();
            if (element != 0) {
                if (collection.contains(element)) {
                    System.out.println("El número ya está en la lista");
                } else {
                    collection.add(element);
                }
            }
        } while (element != 0);

        System.out.println(collection);

    }
}