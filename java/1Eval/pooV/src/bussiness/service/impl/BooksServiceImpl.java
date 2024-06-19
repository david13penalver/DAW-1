package bussiness.service.impl;

import bussiness.entity.Book;
import bussiness.service.BookService;
import persistence.BookRepository;
import persistence.impl.EnumBookRepositoryImpl;
import persistence.impl.StaticBookRepositoryImpl;

import java.util.List;

public class BooksServiceImpl implements BookService {
    private BookRepository bookRepository = new EnumBookRepositoryImpl();
    @Override
    public List<Book> getAll() {
        return this.bookRepository.all();
    }
}
