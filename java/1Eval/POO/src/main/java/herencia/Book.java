package herencia;

import java.util.ArrayList;
import java.util.List;

public class Book extends Product{
    private String author, title;
    private final float DISCOUNT = 0.8F;
    List<Book> booksList = new ArrayList<>();

    public float getPrice(Book book) {
        return price * DISCOUNT;
    }

    public Book() {
    }

    public Book(int id, float price, String author, String title) {
        super(id, price);
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}
