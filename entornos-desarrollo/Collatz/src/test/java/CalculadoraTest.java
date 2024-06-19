import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculadoraTest {
    /* @Test
    @DisplayName("Existe el método")
    void existix() {
        Calculadora calculadora = new Calculadora();
    } */

    @Test
    @DisplayName("Método vacío")
    void sumaVacio() {
        Calculadora calculadora = new Calculadora();
        int result = calculadora.suma("");
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Método 1 número")
    void sumaUnValor2() {
        Calculadora calculadora = new Calculadora();
        int result = calculadora.suma("2");
        assertEquals(2, result);
    }

    @Test
    @DisplayName("Método 1 número")
    void sumaUnValor7() {
        Calculadora calculadora = new Calculadora();
        int result = calculadora.suma("7");
        assertEquals(7, result);
    }

    @Test
    @DisplayName("Método 1 número negativo")
    void sumaUnValorNegativo(){
        Calculadora calculadora = new Calculadora();
        int result = calculadora.suma("-1");
        assertEquals(-1, result);
    }
    @Test
    @DisplayName("Método 2 números")
    void sumaDosValores() {
        Calculadora calculadora = new Calculadora();
        int result = calculadora.suma("2,3");
        assertEquals(5, result);
    }

    @Test
    @DisplayName("Método 2 números otra opción")
    void sumaDosValores2() {
        Calculadora calculadora = new Calculadora();
        int result = calculadora.suma("7,10");
        assertEquals(17, result);
    }

    @Test
    @DisplayName("Método 3 números")
    void sumaDosValores3() {
        Calculadora calculadora = new Calculadora();
        int result = calculadora.suma("7,10,2");
        assertEquals(19, result);
    }
    @Test
    @DisplayName("Método 3 números otra opción")
    void sumaDosValores4() {
        Calculadora calculadora = new Calculadora();
        int result = calculadora.suma("50,5,8");
        assertEquals(63, result);
    }
    @Test
    @DisplayName("Método 10 números otra opción")
    void sumaDosValores10() {
        Calculadora calculadora = new Calculadora();
        int result = calculadora.suma("50,5,8,5,1,1,1,1,1,1");
        assertEquals(74, result);
    }

    @Test
    @DisplayName("Añadiendo separadores")
    void separadores1() {
        Calculadora calculadora = new Calculadora();
        int result = calculadora.suma("1,2\n3");
        assertEquals(6, result);
    }

    @Test
    @DisplayName("Añadiendo separadores2")
    void separadores2() {
        Calculadora calculadora = new Calculadora();
        int result = calculadora.suma("5,9\n1");
        assertEquals(15, result);
    }

    @Test
    @DisplayName("Coma al final dona error")
    void comaFinalError() {
        Calculadora calculadora = new Calculadora();
        int result = calculadora.suma("1,2,");
        assertEquals(15, result);
    }

}
