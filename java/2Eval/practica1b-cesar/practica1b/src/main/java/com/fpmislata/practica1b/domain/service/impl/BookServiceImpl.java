package com.fpmislata.practica1b.domain.service.impl;

import com.fpmislata.practica1b.domain.entity.Author;
import com.fpmislata.practica1b.domain.entity.Book;
import com.fpmislata.practica1b.domain.service.BookService;
import com.fpmislata.practica1b.persistence.BookPersistence;
import com.fpmislata.practica1b.persistence.impl.BookPersistenceImpl;

import java.util.List;

public class BookServiceImpl implements BookService {

    BookPersistence bookPersistence = new BookPersistenceImpl();
    @Override
    public List<Book> findAll() {
        return bookPersistence.findAll();
    }

    @Override
    public Book findById(int id) {
        return bookPersistence.findById(id);
    }

    @Override
    public void insert(Book book, Integer idAuthor) {
        Author author = authorRepository.findById(idAuthor);
        book.setAuthor(author);
        bookPersistence.insert(book, idAuthor);
    }
}
