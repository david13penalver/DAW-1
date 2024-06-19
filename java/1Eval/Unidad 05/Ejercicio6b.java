import java.util.Scanner;

class Ejercicio6b {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Introduce el número a sacar los pares");
        int number = reader.nextInt();

        for (int i = number; i > 0; i -= 2) {
            if (i % 2 != 0) {
                i--;
                System.out.println(i);
            };
            System.out.println(i);
        }

    }
}
