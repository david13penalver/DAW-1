/*import java.util.*;

public class Examen {
    static Scanner reader = new Scanner(System.in);

    static String showMenu() {
        return "1. Mostrar números pares hasta el 100.\n" +
                "2. Mostrar números pares hasta un número introducido por el usuario\n" +
                "3. Listar mayores de edad\n" +
                "4. Matriz\n" +
                "5. Cifrar texto\n" +
                "6. Superhéroes\n" +
                "7. Salir";
    }

    static int ejecuta(int optionMenu) {
        switch (optionMenu) {
            case 7:
                return 7;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            default:
                System.out.println("Ponlo, meloncio");
                return 8;
        }
    }

    static void muestraPares(int num) {
        if (num == 1) {
            for (int i = 2; i < 101; i += 2) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Ingresa un número par");
            Scanner reader = new Scanner(System.in);
            int readeri = reader.nextInt();
            for (int i = 2; i < (readeri + 1); i += 2) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    static void mayoresEdad() {
        Map<String, Integer> diccionario = new HashMap<>();
        int valor;

        diccionario.put("Juan", 18);
        diccionario.put("Pedro", 12);
        diccionario.put("Pablo", 34);

        for (String clave : diccionario.keySet()) {
            valor = diccionario.get(clave);
            System.out.print(clave + " ");
        }
        System.out.println();
    }

    static int[][] creaMatriz() {
        int[][] matriz = {
                {1, 3, 3, 3, 3, 3},
                {2, 1, 3, 3, 3, 3},
                {2, 2, 1, 3, 3, 3},
                {2, 2, 2, 1, 3, 3},
                {2, 2, 2, 2, 1, 3},
                {2, 2, 2, 2, 2, 1}};

        for (int[] elemento_fila : matriz) {
            for (int elemento_columna : elemento_fila) {
                int min = 2;
                int max = 8;
                int r;
                switch (elemento_columna) {
                    case 1:
                        elemento_columna  = 1;
                        break;
                    case 2:
                        r = (int) (Math.random() * (max - min + 1) + min);
                        if (r % 2 == 0) {
                            elemento_columna = r;
                        } else {
                            elemento_columna = r + 1;
                        }
                        break;
                    case 3:
                        r = (int) (Math.random() * (max - min + 1) + min);
                        if (r % 2 == 0) {
                            elemento_columna = r + 1;
                        } else {
                            elemento_columna = r;
                        }
                        break;
                }
            }
        }
        return matriz;
    }

    static int[][] muestraMatriz(int[][] matriz) {
        for (int[] elemento_fila : matriz) {
            for (int elemento_columna : elemento_fila) {
                System.out.print(elemento_columna + " ");
            }
            System.out.println();
        }
        return matriz;
    }

    static void cifradoCesar(String cesar) {
        int shift = 3;
    }

    static void superHeroe() {
        System.out.println("1.- Aliado" +
                "2.- Enemigo" +
                "0.- Salir");
        int option = reader.nextInt();
        int suboption;
        List<String> aliado;
        List<String> villano;
        do {
            aliado = new ArrayList<>();
            villano = new ArrayList<>();

            switch (option) {
                case 1:
                    do {
                        System.out.print("Introduce el nombre de tu aliado: ");
                        String heroe = reader.nextLine();
                        aliado.add(heroe);
                        System.out.println();
                        System.out.print("Si quiere seguir, ponga un número diferente a 0: ");
                        suboption = reader.nextInt();
                        System.out.println();
                    } while (suboption != 0);
                case 2:
                    do {
                        System.out.print("Introduce el nombre de tu enemigo: ");
                        String villano = reader.nextLine();
                        aliado.add(villano);
                        System.out.println();
                        System.out.print("Si quiere seguir, ponga un número diferente a 0: ");
                        suboption = reader.nextInt();
                        System.out.println();
                    } while (suboption != 0);

            }
            System.out.println("1.- Aliado" +
                    "2.- Enemigo" +
                    "0.- Salir");
            option = reader.nextInt();
        } while (option != 0);
        System.out.println("Aliados: ";
        for (Integer elemento : aliado)
            System.out.print(elemento);
        System.out.println();
        System.out.println("Villanos: ";
        for (Integer elemento : villano)
            System.out.print(elemento);
        System.out.println();
    }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int optionMenu;
        int optionSelected;
        int num;
        int[][] matriz = creaMatriz();


        System.out.println(showMenu());

        optionMenu = reader.nextInt();
        ejecuta(optionMenu);
        optionSelected = ejecuta(optionMenu);

        do {
            switch (optionSelected) {
                case 1:
                    num = 1;
                    muestraPares(num);
                    break;
                case 2:
                    num = 2;
                    muestraPares(num);
                    break;
                case 3:
                    mayoresEdad();
                    break;
                case 4:
                    int[][] f = muestraMatriz(matriz);
                    break;
                case 5:
                    String cesar = reader.nextLine();
                    cifradoCesar(cesar);
                    break;
                case 7:
                    superHeroe();
                    break;
            }
            System.out.println("Selecciona una nueva opción:");
            System.out.println(showMenu());
            optionMenu = reader.nextInt();
            ejecuta(optionMenu);
        } while (optionMenu != 7);
    }

}
