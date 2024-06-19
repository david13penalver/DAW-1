package com.fpmislata.practica1b.persistence.impl;

import com.fpmislata.practica1b.domain.entity.Author;
import com.fpmislata.practica1b.domain.entity.Book;
import com.fpmislata.practica1b.persistence.BookPersistence;

import java.util.ArrayList;
import java.util.List;

public class BookPersistenceImpl implements BookPersistence {

    List<Book> bookList = new ArrayList<>(List.of(
            new Book(1, "El Quijote", new Author(1, "Miguel de Cervantes")),
            new Book(2, "El Señor de los Anillos", new Author(2, "J.R.R. Tolkien")),
            new Book(3, "Cien años de soledad", new Author(3, "Gabriel García Márquez"))
        )
    );

    @Override
    public List<Book> findAll() {
        return bookList;
    }

    @Override
    public Book findById(int id) {
        for (Book book : bookList) {
            if (book.getId() == id) {
                return book;
            }
            return book;
        }
        return null;
    }

    @Override
    public void insert(Book book, Integer idAuthor) {

    }

}
