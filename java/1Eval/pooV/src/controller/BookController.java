package controller;

import bussiness.entity.Book;
import bussiness.service.BookService;
import bussiness.service.impl.BooksServiceImpl;

import java.util.List;

public class BookController {
    BookService bookService = new BooksServiceImpl();
    public List<Book> getAll() {
        return bookService.getAll();
    }
}
