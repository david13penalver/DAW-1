import java.util.Scanner;

class Ejercicio6a {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Introduce el número a sacar los pares");
        int number = reader.nextInt();

        while (number > 0) {
            if (number % 2 != 0) {
                number--;
                System.out.println(number);
            };
            System.out.println(number);
            number -= 2;
        }

    }
}
