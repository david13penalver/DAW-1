import java.util.Scanner;

public class Ejercicio2c {
    static Scanner reader = new Scanner(System.in);

    static int[] initializeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce elemento array");
            int option = reader.nextInt();
            array[i] = option;
        }
        return array;
    }

    static void showArray (int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("Introduce tamaño array");
        Scanner reader = new Scanner(System.in);

        int size = reader.nextInt();
        int[] array = new int[size];

        initializeArray(array);
        showArray(array);

    }

}
