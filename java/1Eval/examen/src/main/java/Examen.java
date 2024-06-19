import java.util.*;

public class Examen {
    static Scanner reader = new Scanner(System.in);

    static String showMenu() {
        return "1. Mostrar números primos hasta el 100\n" +
                "2. Contar una letra en una frase\n" +
                "3. Dibujar cara\n" +
                "4. Palabras B/V\n" +
                "5. Contar herramientas\n" +
                "0. Salir\n"+
                "Opción: ";
    }

    static void executeOption(int option) {
        switch (option) {
            case 1:
                primeNumber();
                break;
            case 2:
                countLetters();
                break;
            case 3:
                showFace(createFace());
                break;
            case 4:
                wordsVB();
                break;
            case 5:
                toolsCount();
                break;
        }
    }

    static void countLetters() {
        int counter = 0;
        char vocalChar, charAt;
        String phrase, vocal;

        System.out.print("Escribe una frase: ");
        phrase = reader.nextLine().toLowerCase();
        System.out.println();
        System.out.print("Escribe la letra que quieres contar: ");
        vocal = reader.nextLine();

        vocalChar = vocal.charAt(0);

        for (int i = 0; i < phrase.length(); i++) {
            charAt = phrase.charAt(i);
            if (charAt == vocalChar) {
                counter++;
            }
        }
        System.out.println("La letra " + vocal + " se repite " + counter +
                " vez/veces en la frase '" + phrase + "'.");
    }

    static int[][] createFace() {
        System.out.print("1- Contento. 2- Triste.: ");
        int option = reader.nextInt();
        System.out.println();

        int[][] happy = {
                {0, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {2, 0, 0, 0, 0, 2},
                {0, 2, 2, 2, 2, 0}
        };

        int[][] sad = {
                {0, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 2, 2, 2, 2, 0},
                {2, 0, 0, 0, 0, 2}
        };

        int[][] error = {
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };

        if (option == 1) {
            return happy;
        } else if (option == 2) {
            return sad;
        } else {
            return error;
        }
    }

    static void showFace(int[][] face) {
        for (int[] row_element : face) {
            for (int column_element : row_element) {
                switch (column_element) {
                    case 0:
                        System.out.print("- ");
                        break;
                    case 1:
                        System.out.print("0 ");
                        break;
                    case 2:
                        System.out.print("x ");
                        break;
                }
            }
            System.out.println();
        }
    }

    static void primeNumber() {
        boolean prime;
        System.out.println("Los números primos del 1 al 100 son los siguientes:");

        for (int num = 2; num <= 100; num++) {
            prime = true;
            for (int i = num - 1; i > 1; i--) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    static void wordsVB() {
        String option;
        List<String> wordsV = new ArrayList<>();
        List<String> wordsB = new ArrayList<>();

        reader.nextLine();
        do {
            System.out.println("Inserta una palabra que empiece por B o por V:");
            option = reader.nextLine().toLowerCase();
            char character = option.charAt(0);

            if (character == 'v') {
                wordsV.add(option);
            }
            if (character == 'b') {
                wordsB.add(option);
            }
        } while ((!option.equals("salir")));

        System.out.println("Palabras que empiezan por V:");
        for (String elemento: wordsV) {
            System.out.println(elemento);
        }
        System.out.println();

        System.out.println("Palabras que empiezan por B:");
        for (String elemento: wordsB) {
            System.out.println(elemento);
        }
    }

    static void toolsCount() {
        String[] tools = {"martillo", "destornillador", "clavo", "martillo", "taladro", "martillo",
                "destornillador"};
        Map<String, Integer> toolCount = new HashMap<>();
        int times = 1, increase = 2, value;

        Arrays.sort(tools);

        for (int i = 0; i < tools.length; i++) {
            if (toolCount.containsKey(tools[i])) {
                toolCount.put(tools[i], times += 1);
            } else {
                times = 1;
                toolCount.put(tools[i], 1);
            }
        }

        for (String key : toolCount.keySet()) {
            value = toolCount.get(key);
            System.out.println(key + ": " + value);
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int option;

        do {
            System.out.println(showMenu());
            option = reader.nextInt();
            executeOption(option);
        } while (option != 0);


    }

}
