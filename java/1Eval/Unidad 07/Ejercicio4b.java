import java.util.Scanner;
import java.util.Collection;
import java.util.HashSet;
class Ejercicio4b {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int size;
        int element;
        HashSet<Integer> collection = new HashSet<>();

        

        do {
            element = reader.nextInt();
            if (element != 0) {
                collection.add(element);
            }
        } while (element != 0);

        System.out.println(collection);

    }
}