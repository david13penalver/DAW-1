import controller.BookController;

public class App {
    public static void main(String[] args) {
        BookController bookController = new BookController();
        System.out.println(bookController.getAll());
    }
}