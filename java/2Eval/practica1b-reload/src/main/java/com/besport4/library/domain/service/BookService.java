package com.besport4.library.domain.service;

import com.besport4.library.domain.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getAll();

    Book findById(int id);
}
