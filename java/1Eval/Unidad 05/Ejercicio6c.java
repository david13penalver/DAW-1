import java.util.Scanner;

class Ejercicio6c {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Introduce el número a sacar los pares");
        int number = reader.nextInt();

        for (int i = 1; i < number; i++) {
            if (i % 2 != 0) {
                continue;
            };
            System.out.println(i);
        }

    }
}
