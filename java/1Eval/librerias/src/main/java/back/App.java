package back;
import back.controller.CustomerController;

import java.util.Scanner;

public class App {

    private CustomerController customerController = new CustomerController();
    Scanner scanner = new Scanner(System.in);
    public String response(int option) {
        if (option == 1) {
            return customerController.findAll().toString();
        } else if (option == 2) {
            System.out.println("Escribe el id: ");
            int id = scanner.nextInt();
            return customerController.findById(id).toString();
        } else {
            return "404 .- Recurso no encontrado";
        }
    }
}
