public class Calculadora {
    private static int resultado;

    public static int sumar(int num1, int num2) {
        resultado = num1 + num2;
        return resultado;
    }

    public static int restar(int num1, int num2) {
        resultado = num1 - num2;
        return resultado;
    }

    public static int multiplicar(int num1, int num2) {
        resultado = num1 * num2;
        return resultado;
    }

    public static int dividir(int num1, int num2) {
        resultado = num1 / num2;
        return resultado;
    }
}
