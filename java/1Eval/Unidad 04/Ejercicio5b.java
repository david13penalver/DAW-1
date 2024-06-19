import java.util.Random;
import java.util.Scanner;
class Ejercicio5a {
    public static void main(String[] args) {

        Random generateRandom = new Random();
        Scanner reader = new Scanner(System.in);

        System.out.println("Inserta el valor mínimo: ");
        int min = reader.nextInt();
        System.out.println("Tu número es el: " + min);
        System.out.println("Inserta el valor máximo: ");
        int max = reader.nextInt();
        System.out.println("Tu segundo número es el: " + max);

        int randomNumber = generateRandom.nextInt(min, max);

        System.out.println(randomNumber);



    }
}
