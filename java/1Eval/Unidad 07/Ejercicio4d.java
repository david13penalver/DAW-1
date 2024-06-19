import java.util.Scanner;
import java.util.Collection;
import java.util.HashSet;
class Ejercicio4d {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int size;
        int element;
        HashSet<Integer> collectionPar = new HashSet<>();
        HashSet<Integer> collectionImpar = new HashSet<>();




        do {
            System.out.println("Selecciona un número que añadir a las colecciones par o impar." +
                    "Con el 0 se para la tarea:");
            element = reader.nextInt();
            if (element != 0) {
                if (collectionPar.contains(element) || collectionImpar.contains(element)) {
                    System.out.println("El número ya está en la lista");
                } else if (element % 2 == 0) {
                    collectionPar.add(element);
                } else {
                    collectionImpar.add(element);
                }
            }
        } while (element != 0);

        System.out.println(collectionPar);
        System.out.println(collectionImpar);


    }
}