import java.util.Scanner;

class Ejercicio4a {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Introduce el color");
        String color = myObj.nextLine().trim().toLowerCase();

        switch (color) {
            case "rojo":
                System.out.println("Color de la sangre");
                break;
            case "azul":
                System.out.println("Color del cielo");
                break;
            case "amarillo":
                System.out.println("Color del sol");
                break;
            default:
                System.out.println("Lo siento, ese color es muy aburrido");
                break;
        }

            
    }
}
