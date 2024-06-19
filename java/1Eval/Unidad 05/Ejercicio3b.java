import java.util.Scanner;

class Ejercicio3b {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Introduce el número a calcular");
        int num = reader.nextInt() % 2;

        boolean num2 = (num == 0);

        String result = (num2)? "Es par": "Es impar";

        System.out.println(result);

    }
}
