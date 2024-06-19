import java.util.Scanner;

public class Ejercicio2a {

    public static void main(String[] args) {

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            Scanner reader = new Scanner(System.in);
            int option = reader.nextInt();
            array[i] = option;
        }

        for (int elemento : array) {
            System.out.print(elemento + " ");
        }
    }

}
