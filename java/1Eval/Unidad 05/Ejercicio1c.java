import java.util.Scanner;

class Ejercicio1b {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int edad;

        System.out.println("Introduce tu edad, por favor");
        edad = reader.nextInt();

        String frase = (edad >= 18)? "Puedes pasar": "No puedes pasar";

        System.out.println(frase);

    }
}
