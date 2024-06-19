package persistence;

import bussiness.entity.Book;

import java.util.List;

public interface BookRepository {
    List<Book> all();
}
