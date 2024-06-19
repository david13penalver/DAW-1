import java.util.Scanner;

class Ejercicio5b {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Introduce el número a factorizar");
        int number = reader.nextInt();
        int result;
        int j = 1;

        for (int i = 1; i <= number; i++) {
            j = j * i;
        }

        System.out.println(j);


    }
}
