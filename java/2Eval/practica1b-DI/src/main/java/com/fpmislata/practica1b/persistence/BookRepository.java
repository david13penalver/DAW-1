package com.fpmislata.practica1b.persistence;

import com.fpmislata.practica1b.domain.entity.Book;

import java.util.List;

public interface BookRepository {
    List<Book> getAll();

    Book findById(int id);
}
