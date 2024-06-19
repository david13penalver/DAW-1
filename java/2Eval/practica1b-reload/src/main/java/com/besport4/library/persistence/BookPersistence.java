package com.besport4.library.persistence;

import com.besport4.library.domain.entity.Book;

import java.util.List;

public interface BookPersistence {
    List<Book> getAll();

    Book findById(int id);
}
