import java.util.*;

public class Examen_Casa {
    static Scanner reader = new Scanner(System.in);
    static String showMenu() {
        return "1.- Mostrar números pares hasta el 100.\n" +
                "2.- Mostrar números pares hasta un número introducido por el usuario.\n" +
                "3.- Listar mayores de edad.\n" +
                "4.- Matriz.\n" +
                "5.- Cifrar texto.\n" +
                "6. Superhéroes.\n" +
                "7. Salir.\n";
    }

    static int ejecuta(int option) {
        switch (option) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
        }
        return 0;
    }

    static void muestraPares(int selectedOption) {
        if (selectedOption == 1) {
            for (int i = 2; i < 101; i += 2) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Selecciona el número:");
            int j = reader.nextInt();
            for (int i = 2; i <= j; i += 2) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
    }

    static void mayoresEdad() {
        Map<String, Integer> diccionario = new HashMap<>();
        diccionario = Map.of("Pepe", 18, "Paco", 20, "Alfredo", 17);
        for (String clave : diccionario.keySet()) {
            int valor = diccionario.get(clave);
            System.out.print(clave + " ");
        }
        System.out.println();
    }

    static int[][] creaMatriz() {
        int size = 6;
        int[][] matriz = new int [size][size];
        int min = 2;
        int max = 10;
        int option;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                    matriz[i][j] = 1;

                if (i > j) { // Par
                    do {
                    option = (int) (Math.random() * (max - min)) + min;
                    } while (option % 2 != 0);
                    matriz[i][j] = option;
                }
                if (i < j) { // Impar
                    do {
                        option = (int) (Math.random() * (max - min)) + min;
                    } while (option % 2 == 0);
                    matriz[i][j] = option;
                    }
                }
            }
        return matriz;
        }

    static void muestraMatriz (int[][] matriz) {
        for (int[] elemento_fila : matriz) {
            for (int elemento_columna : elemento_fila) {
                System.out.print(elemento_columna + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static String cifrarCesar(String mensaje, int desplazamiento) {
        StringBuilder mensajeCifrado = new StringBuilder();
        mensaje = reader.nextLine();

        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);
            if (Character.isLetter(caracter)) {
                // Determina si el caracter es mayúscula o minúscula
                char base = Character.isUpperCase(caracter) ? 'A' : 'a';
                char cifrado = (char) ((caracter - base + desplazamiento) % 26 + base);
                mensajeCifrado.append(cifrado);
            } else {
                // Si el caracter no es una letra, simplemente lo agregamos sin cifrar
                mensajeCifrado.append(caracter);
            }
        }

        return mensajeCifrado.toString();
    }

    static String superheroe() {
        int option, suboption;
        List<String> aliados = new ArrayList<>();
        List<String> villanos = new ArrayList<>();

        do {
            System.out.println("1.- Aliado");
            System.out.println("2.- Enemigo");
            System.out.println("0.- Salir");
            System.out.println("Inserte opción: ");
            option = reader.nextInt();
            switch (option) {
                case 1:
                    do {
                        reader.nextLine();
                        System.out.println("Inserte nombre del aliado:");
                        aliados.add(reader.nextLine());
                        System.out.println("Añadido, si quiere añadir otro, escriba un número distinto a 0:");
                        suboption = reader.nextInt();
                    } while (suboption != 0);
                    break;
                case 2:
                    do {
                        reader.nextLine();
                        System.out.println("Inserte nombre del aliado:");
                        villanos.add(reader.nextLine());
                        System.out.println("Añadido, si quiere añadir otro, escriba un número distinto a 0:");
                        suboption = reader.nextInt();
                    } while (suboption != 0);
                    break;
            }

        } while (option != 0);
        return "Aliados: " + aliados + ". Villanos: " + villanos + ".";
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int option;
        int selectedOption;

        do {
            System.out.println(showMenu());
            option = reader.nextInt();
            selectedOption = ejecuta(option);
            switch (selectedOption) {
                case 1:
                    System.out.println("Opción 1:");
                    muestraPares(1);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Opción 2:");
                    muestraPares(2);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Opción 3:");
                    mayoresEdad();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("In process");
                    int[][] matrix = creaMatriz();
                    muestraMatriz(matrix);
                    break;
                case 5:
                    System.out.println("Opción 5:");
                    String mensajeOriginal = "";
                    int desplazamiento = 3;

                    String mensajeCifrado = cifrarCesar(mensajeOriginal, desplazamiento);
                    System.out.println("Mensaje Cifrado: " + mensajeCifrado);
                    break;
                case 6:
                    System.out.println("Opción 6:");
                    System.out.println(superheroe());
                    break;
                case 7:
                    System.out.println("Cerrando...");
                    break;
            }
        } while (option != 7);

    }
}
