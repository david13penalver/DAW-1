public class Ejercicio3a {

    public static void main(String[] args) {

        boolean array[][] = {
                {true, true, true, true, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, true, true, true, true}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]) {
                    System.out.print("0");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
