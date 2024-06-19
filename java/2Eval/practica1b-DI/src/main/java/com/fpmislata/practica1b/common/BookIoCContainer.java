package com.fpmislata.practica1b.common;

import com.fpmislata.practica1b.domain.service.BookService;
import com.fpmislata.practica1b.domain.service.impl.BookServiceImpl;
import com.fpmislata.practica1b.persistence.BookRepository;
import com.fpmislata.practica1b.persistence.impl.BookRepositoryImpl;

public class BookIoCContainer {
    private static BookService bookService;
    private static BookRepository bookRepository;

    public static BookService getBookService() {
        if (bookService == null) {
            bookService = new BookServiceImpl(getBookRepository());
        }
        return bookService;
    }

    public static BookRepository getBookRepository() {
        if (bookRepository == null) {
            bookRepository = new BookRepositoryImpl();
        }
        return bookRepository;
    }
}
