public class Calculadora {
    private int resultado = 0;
//    public int suma(String num1) {
//        if (num1.contains(",") || num1.contains("\\n")) {
//            String[] parts = num1.split("\\n|,");
//            for (int i = 0; i < parts.length; i++) {
//                resultado += Integer.parseInt(parts[i]);
//            }
//            return resultado;
//        }
//        if (!num1.equals("")) {
//            return Integer.parseInt(num1);
//        }
//        return 0;
//    }
public int suma(String num1) {
    if (num1.isBlank()) return 0;
    String[] parts = num1.split("\\n|,");
    for (int i = 0; i < parts.length; i++) {
        resultado += Integer.parseInt(parts[i]);
    }
    return resultado;
}
}
