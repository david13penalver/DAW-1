import java.util.Scanner;

class Ejercicio2b {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Seleccione la longitud del array.");

        int elementos = reader.nextInt();

        System.out.println("Su array será de " + elementos + ".");

        int[] numbers = new int[elementos];

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