package front;

import java.util.Scanner;

public class App {
    static int option;
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        option = -1;
        Menu menu = new Menu();

        while (option != 0) {
            System.out.println(menu.showMenu());
            option = reader.nextInt();
            System.out.println(request(option));
            System.out.println();
        }
    }
    public static String request(int option) {
        back.App app = new back.App();
        return app.response(option);
    }
}
