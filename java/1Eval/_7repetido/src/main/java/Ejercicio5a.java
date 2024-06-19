import java.util.*;

public class Ejercicio5a {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Set<Integer> conjuntoPar = new HashSet<>();
        Set<Integer> conjuntoImpar = new HashSet<>();

        int nota;

        List<String> lista = new ArrayList<>();

        lista = List.of("Ana", "Pedro", "Antonio", "Amparo", "Luis", "María");

        for (String alumno : lista) {
            System.out.println("Inserta la nota de " + alumno);
            nota = reader.nextInt();
            if (nota >= 5) {
                System.out.println("El alumno " + alumno + " está aprobado con un " + nota);
            }
        }

    }

}
