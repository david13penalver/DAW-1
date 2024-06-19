import java.util.Scanner;

class Ejercicio8a {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Introduce el número a sacar su tabla de multiplicación");
        int number = reader.nextInt();
        int j;


        for (int i = 0; i <= 10; i++) {
            j = number * i;
            System.out.println(number + " x " + i + " = " + j);
        }


    }
}
