import java.util.Scanner;

class Ejercicio8b {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Introduce el número a sacar su tabla de multiplicación y sumatorio");
        int number = reader.nextInt();
        int mult;
        int sum;
        int j;

        for (int i = 1; i <= 10; i++) {
            mult = number * i;
            System.out.println(number + " x " + i + " = " + mult);
            sum = 1;
            for (j = 2; j <= mult; j++) {
                sum += j;
            }
            System.out.println("Suma = " + sum);

        }


    }
}
