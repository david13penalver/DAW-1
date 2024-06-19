import java.util.Scanner;

class Ejercicio2a {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Ingresa el número para la posición " + i + " del array:");
            numbers[i] = reader.nextInt();
            System.out.println("Número ingresado: " + numbers[i]);
        };

        for (int i : numbers) {
            System.out.println(i);
        };

    }
}