package herencia;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product book1 = new Book(1, 20, "Título 1", "Autor 1");
        Product book2 = new Book(2, 15, "Título A", "Autor 2");
        Product book3 = new Book(3, 17.95F, "Título 2", "Autor 1");

        Product clothe1 = new Clothes(4, 4.95F, "Calzoncillos", 40, "Transparente");
        Product clothe2 = new Clothes(5, 9.95F, "Pantalón", 42, "Azul");
        Product clothe3 = new Clothes(6, 2.95F, "Calcetines", 43, "Blanco");

        List<Product> product1 = new ArrayList<>();
        product1.add(book1);
        product1.add(book2);
        product1.add(book3);
        product1.add(clothe1);
        product1.add(clothe2);
        product1.add(clothe3);

        System.out.println(product1);
        System.out.println(book1);
        System.out.println(book1.getPrice());

        //Computer computer1 = new Computer((256, 16, "Intel i7-7800U");
        Computer computer = new Computer(
                new HD(1, 256),
                new Memory(8),
                new CPU("Ryzen 7", 3),
                1, 3.00f
        );

    }

//    public static void showProduct(int type) {
//        for (Product product : product) {
//            if (product.getClass().equals(Book.class) && type == 1) {
//                System.out.println(product);
//            } else
//        }
//
//    }
}
