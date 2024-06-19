import java.util.Scanner;

class Ejercicio7a {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Introduce el número a sacar su primer múltiple");
        int number = reader.nextInt();
        int j = 2;
        boolean found = false;

        while (!found) {
            if (number % j == 0) {
                System.out.println("El primer múltiple es " + j);
                found = true;
            } else {
                j++;
            }
        }


    }
}
