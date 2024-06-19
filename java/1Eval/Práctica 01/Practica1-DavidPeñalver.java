    import java.util.Scanner;

class Practica1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        String adminCuenta = "admin";
        String adminContrasenya = "admin";
        String usuarioCuenta = "usuario";
        String usuarioContrasenya = "usuario";
        String userName;
        String userPass;
        int option;
        int suboption;
        int attempts = 3;

        System.out.println("¡Bienvenido/a! Inserte su usuario y contraseña, tiene 3 intentos");

        do {
            System.out.print("Usuario: ");
            userName = myObj.nextLine();
            System.out.print("Contraseña: ");
            userPass = myObj.nextLine();

            if (userName.equals(adminCuenta) && userPass.equals(adminContrasenya)) {
                do {
                    System.out.println("1.- Administrar películas\n" +
                            "2.- Administrar usuarios\n" +
                            "0.- Salir\n" +
                            "-------------------------\n" +
                            "Opción: ");
                    option = myObj.nextInt();
                    if (option == 1) {
                        do {
                            System.out.println("1.- Añadir película\n" +
                                    "2.- Modificar película\n" +
                                    "3.- Borrar película\n" +
                                    "0.- Volver\n" +
                                    "-------------------------\n" +
                                    "Opción: ");
                            suboption = myObj.nextInt();
                        } while (suboption != 0);
                    }
                    if (option == 2) {
                        do {
                            System.out.println("1.- Añadir usuario\n" +
                                    "2.- Borrar usuario\n" +
                                    "0.- Volver\n" +
                                    "-------------------------\n" +
                                    "Opción: ");
                            suboption = myObj.nextInt();
                        } while (suboption != 0);
                    }
                } while (option != 0);
                if (option == 0) {
                    System.out.println("Cerrando programa.");
                    System.exit(0);
                }
            } else if (userName.equals(usuarioCuenta) && userPass.equals(usuarioContrasenya)) {
                do {
                    System.out.println("1.- Peliculas\n" +
                            "2.- Configuración usuario\n" +
                            "0.- Salir\n" +
                            "-------------------------\n" +
                            "Opción: ");
                    option = myObj.nextInt();
                    if (option == 1) {
                        do {
                            System.out.println("1.- Casablanca\n" +
                                    "2.- El padrino\n" +
                                    "0.- Volver\n" +
                                    "-------------------------\n" +
                                    "Opción: ");
                            suboption = myObj.nextInt();
                        } while (suboption != 0);
                    }
                    if (option == 2) {
                        do {
                            System.out.println("1.- Cambiar nombre usuario\n" +
                                    "2.- Cambiar password\n" +
                                    "0.- Volver\n" +
                                    "-------------------------\n" +
                                    "Opción: ");
                            suboption = myObj.nextInt();
                        } while (suboption != 0);
                    }
                } while (option != 0);
                if (option == 0) {
                    System.out.println("Cerrando programa.");
                    System.exit(0);
                }
            } else {
                attempts--;
                System.out.println("Te quedan " + attempts + " intento(s).");

            }
        } while (attempts > 0);

        if (attempts == 0) {
            System.out.println("Te has quedado sin intentos. Cerrando programa");
            System.exit(0);
        }

    }
}
