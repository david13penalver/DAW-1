package com.besport4.library.domain.service.impl;

import com.besport4.library.domain.entity.Book;
import com.besport4.library.domain.service.BookService;
import com.besport4.library.persistence.BookPersistence;
import com.besport4.library.persistence.impl.BookPersistenceImpl;

import java.util.List;

public class BookServiceImpl implements BookService {
    BookPersistence bookPersistence = new BookPersistenceImpl();

    @Override
    public List<Book> getAll() {
        return bookPersistence.getAll();
    }

    @Override
    public Book findById(int id) {
        return bookPersistence.findById(id);
    }
}
