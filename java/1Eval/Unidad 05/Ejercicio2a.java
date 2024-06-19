import java.util.Scanner;

class Ejercicio2a {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Introduce el primer número");
        int num1 = reader.nextInt();
        System.out.println("Introduce el segundo número");
        int num2 = reader.nextInt();

        if (num1 < num2) {
            System.out.println("El segundo número es mayor");
        } else {
            System.out.println("El primer número es mayor");
        }
        
    }
}
