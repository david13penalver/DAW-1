import java.util.Random;
class Ejercicio5a {
    public static void main(String[] args) {

        Random generateRandom = new Random();

        int randomNumber = generateRandom.nextInt(10);

        System.out.println(randomNumber);

        int randomMath = (int) (10 * (Math.random()));

        System.out.println(randomMath);

    }
}
