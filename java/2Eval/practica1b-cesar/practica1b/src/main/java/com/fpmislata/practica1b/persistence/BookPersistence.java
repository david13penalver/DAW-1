package com.fpmislata.practica1b.persistence;

import com.fpmislata.practica1b.domain.entity.Book;

import java.util.List;

public interface BookPersistence {
    List<Book> findAll();

    Book findById(int id);

    void insert(Book book, Integer idAuthor);
}
