import java.util.*;

public class Ejercicio5b {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Set<Integer> conjuntoPar = new HashSet<>();
        Set<Integer> conjuntoImpar = new HashSet<>();

        int nota;

        List<String> lista = new ArrayList<>();

        lista = List.of("Ana", "Pedro", "Antonio", "Amparo", "Luis", "María");
        List<String> aprobados = new ArrayList<>();

        for (String alumno : lista) {
            System.out.println("Inserta la nota de " + alumno);
            nota = reader.nextInt();
            if (nota >= 5) {
                aprobados.add(alumno);
            }
        }

        System.out.println("Alumnos aprobados: " + aprobados);

    }

}
