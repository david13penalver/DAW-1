import java.util.Scanner;

class Ejercicio2b {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Introduce el primer número");
        int num1 = reader.nextInt();
        System.out.println("Introduce el segundo número");
        int num2 = reader.nextInt();

        String result = (num1 < num2)? "El segundo número es mayor": "El primer número es mayor";

        System.out.println(result);
        
    }
}
