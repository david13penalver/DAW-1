package com.besport4.library.persistence.impl;

import com.besport4.library.domain.entity.Book;
import com.besport4.library.persistence.BookPersistence;

import java.util.List;

public class BookPersistenceImpl implements BookPersistence {

    List<Book> bookList = List.of(
            new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book(2, "To Kill a Mockingbird", "Harper Lee"),
            new Book(3, "1984", "George Orwell"),
            new Book(4, "The Catcher in the Rye", "J.D. Salinger"),
            new Book(5, "The Grapes of Wrath", "John Steinbeck")
    );

    @Override
    public List<Book> getAll() {
        return bookList;
    }

    @Override
    public Book findById(int id) {
        for (Book book : bookList) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }
}
