public class Ejercicio1c {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 5, 8, 13, 21, 34, 55};

        for (int i = 0; i < array.length; i++) {
            array[i] *= array[i];
            System.out.println(array[i]);
        }
    }

}