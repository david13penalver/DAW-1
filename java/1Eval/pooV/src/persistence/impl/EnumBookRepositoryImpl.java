package persistence.impl;

import bussiness.entity.Book;
import persistence.BookRepository;
import persistence.EnumBook;

import java.util.List;

public class EnumBookRepositoryImpl implements BookRepository {
    private List<Book> bookList = List.of(
            new Book(EnumBook.THE_HOBBIT.getId(), EnumBook.THE_HOBBIT.getAuthor(), EnumBook.THE_HOBBIT.getTitle()),
            new Book(EnumBook.HARRY_POTTER.getId(), EnumBook.HARRY_POTTER.getAuthor(), EnumBook.HARRY_POTTER.getTitle()),
            new Book((EnumBook.TO_KILL_A_MOCKINGBIRD.getId()), EnumBook.TO_KILL_A_MOCKINGBIRD.getAuthor(), EnumBook.TO_KILL_A_MOCKINGBIRD.getTitle())
    );
    @Override
    public List<Book> all() {
        return bookList;
    }
}
