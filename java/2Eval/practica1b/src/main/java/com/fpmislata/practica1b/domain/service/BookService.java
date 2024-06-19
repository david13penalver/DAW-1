package com.fpmislata.practica1b.domain.service;

import com.fpmislata.practica1b.domain.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getAll();

    Book findById(int id);
}
