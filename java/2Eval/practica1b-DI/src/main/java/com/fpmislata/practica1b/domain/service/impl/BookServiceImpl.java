package com.fpmislata.practica1b.domain.service.impl;

import com.fpmislata.practica1b.domain.entity.Book;
import com.fpmislata.practica1b.domain.service.BookService;
import com.fpmislata.practica1b.persistence.BookRepository;
import com.fpmislata.practica1b.persistence.impl.BookRepositoryImpl;

import java.util.List;

public class BookServiceImpl implements BookService {
    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @Override
    public List<Book> getAll() {
        return bookRepository.getAll();
    }

    @Override
    public Book findById(int id) {
        return bookRepository.findById(id);
    }
}
