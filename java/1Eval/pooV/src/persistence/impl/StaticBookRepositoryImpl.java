package persistence.impl;

import bussiness.entity.Book;
import persistence.BookRepository;

import java.util.List;

public class StaticBookRepositoryImpl implements BookRepository {

    List<Book> bookList = List.of(
            new Book(1, "El señor de los anillos", "J.R.R. Tolkien"),
            new Book(2, "El hobbit", "J.R.R. Tolkien"),
            new Book(3, "El silmarillion", "J.R.R. Tolkien"),
            new Book(4, "El retrato de Dorian Gray", "Oscar Wilde"),
            new Book(5, "Las aventuras de Sherlock Holmes", "Arthur Conan Doyle"),
            new Book(6, "Sherlock Holmes: El sabueso de los Baskerville", "Arthur Conan Doyle"),
            new Book(7, "El mundo perdido", "Arthur Conan Doyle"),
            new Book(8, "El conde de Montecristo", "Alexandre Dumas"),
            new Book(9, "Los tres mosqueteros", "Alexandre Dumas"),
            new Book(10, "Veinte años después", "Alexandre Dumas")
    );
    @Override
    public List<Book> all() {
        return bookList;
    }
}
