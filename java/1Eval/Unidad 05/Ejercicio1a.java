import java.util.Scanner;

class Ejercicio1a {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int edad;

        System.out.println("Introduce tu edad, por favor");
        edad = reader.nextInt();


        if (edad >= 18) {
            System.out.println("Puedes pasar");
        } else {
            System.out.println("No puedes pasar");
        };
    }
}
