public class Singleton {
    private static Singleton instance = null;
    private static int contador = 0;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static String checkInstance() {
        return "Instancia creada. Contador: " + contador;
    }

    public String SingletonMethod() {
        return "Singleton instanciado bajo demanda";
    }

}
