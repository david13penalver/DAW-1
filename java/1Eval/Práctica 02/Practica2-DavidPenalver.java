import java.util.Scanner;

class Practica2 {

    // Funciones aquí
    static String userName = "user";
    static String userPassword = "user";
    static String adminName = "admin";
    static String adminPassword = "admin";
    static int attempts = 3;

    static int checkUser(String user, String password) {
        if (user.equals(userName) && user.equals(userPassword)) {
            return 0;
        } else if (user.equals(adminName) && user.equals(adminPassword)) {
            return 1;
        } else {
            attempts--;
            System.out.println("Error de credenciales. Quedan " + attempts + " intento(s).");
            return -1;
        }
    }

    static void buildMainMenu(int check) {
        switch (check) {
            case 0:
                System.out.println("1.- Peliculas\n" +
                        "2.- Configuración usuario\n" +
                        "0.- Salir\n" +
                        "-------------------------\n" +
                        "Opción: ");
                break;
            case 1:
                System.out.println("1.- Administrar películas\n" +
                        "2.- Administrar usuarios\n" +
                        "0.- Salir\n" +
                        "-------------------------\n" +
                        "Opción: ");
                break;
        }
    }
    //Hasta aquí está todo OK

    static String buildUserMenu(int optionUser) {
        switch (optionUser) {
            case 1:
                return ("1.- Casablanca\n" +
                        "2.- El padrino\n" +
                        "0.- Volver\n" +
                        "-------------------------\n" +
                        "Opción: ");
                //break;
            case 2:
                return ("1.- Cambiar nombre usuario\n" +
                        "2.- Cambiar password\n" +
                        "0.- Volver\n" +
                        "-------------------------\n" +
                        "Opción: ");
                //break;
            default:
                System.exit(0);
                return  ("Opción no correcta");
        }
    }

    static String buildAdminMenu(int optionAdmin) {
        switch (optionAdmin) {
            case 1:
                return ("1.- Añadir película\n" +
                        "2.- Modificar película\n" +
                        "3.- Borrar película\n" +
                        "0.- Volver\n" +
                        "-------------------------\n" +
                        "Opción: ");
            //break;
            case 2:
                return ("1.- Añadir usuario\n" +
                        "2.- Borrar usuario\n" +
                        "0.- Volver\n" +
                        "-------------------------\n" +
                        "Opción: ");
            //break;
            default:
                System.exit(0);
                return  ("Opción no correcta");
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String userEntry;
        String passwordEntry;
        int check;
        int optionUser;
        int optionAdmin;
        int suboption;
        String userSubMenu;
        String adminSubMenu;

        System.out.println("¡Bienvenido/a! Inserte su usuario y contraseña, tiene 3 intentos.");

        do {
            System.out.println("Inserte nombre de usuario");
            userEntry = reader.nextLine();
            System.out.println("Inserte contraseña");
            passwordEntry = reader.nextLine();

            check = checkUser(userEntry, userPassword);

            if (check == 0) {
                do {
                    buildMainMenu(check);
                    optionUser = reader.nextInt();
                    userSubMenu = buildUserMenu(optionUser);
                    do {
                        System.out.println(userSubMenu);
                        suboption = reader.nextInt();
                    } while (suboption != 0);
                } while (optionUser != 0);

                if (optionUser == 0) {
                    System.exit(0);
                };

            } else if (check == 1) {
                do {
                    buildMainMenu(check);
                    optionAdmin = reader.nextInt();
                    adminSubMenu = buildAdminMenu(optionAdmin);
                    do {
                        System.out.println(adminSubMenu);
                        suboption = reader.nextInt();
                    } while (suboption != 0);
                } while (optionAdmin != 0);

                if (optionAdmin == 0) {
                    System.exit(0);
                };

            }

        } while (Practica2.attempts > 0);

        if (Practica2.attempts == 0) {
            System.out.println(
                    "Cerrando programa.\n" +
                    "Cerrando programa..\n" +
                    "Cerrando programa...\n");
            System.exit(0);
        }
    }
}