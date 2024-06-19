import java.util.Scanner;

public class Ejercicio2b {

    public static void main(String[] args) {

        System.out.println("Introduce tamaño array");
        Scanner reader = new Scanner(System.in);

        int size = reader.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce elemento array");
            int option = reader.nextInt();
            array[i] = option;
        }

        for (int elemento : array) {
            System.out.print(elemento + " ");
        }
    }

}
