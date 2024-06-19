import java.util.Scanner;

class Ejercicio1b {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int edad;
        String frase = "No puedes pasar";

        System.out.println("Introduce tu edad, por favor");
        edad = reader.nextInt();


        if (edad >= 18) {
            frase = "Puedes pasar";
        };

        System.out.println(frase);

    }
}
