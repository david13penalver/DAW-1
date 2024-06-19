import java.util.Scanner;

class Ejercicio7b {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Introduce el número a sacar su primer múltiple");
        int number = reader.nextInt();


        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
                break;
            } else {
                i++;
            }
        }


    }
}
