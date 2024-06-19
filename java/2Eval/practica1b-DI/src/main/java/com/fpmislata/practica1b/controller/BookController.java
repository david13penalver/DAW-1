package com.fpmislata.practica1b.controller;

import com.fpmislata.practica1b.common.BookIoCContainer;
import com.fpmislata.practica1b.domain.entity.Book;
import com.fpmislata.practica1b.domain.entity.Form;
import com.fpmislata.practica1b.domain.service.BookService;
import com.fpmislata.practica1b.domain.service.impl.BookServiceImpl;
import com.fpmislata.practica1b.persistence.BookRepository;
import com.fpmislata.practica1b.persistence.impl.BookRepositoryImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/books")
@Controller
public class BookController {
    //BookService bookService = new BookServiceImpl();
    private BookService bookService;

//    public BookController() {
//        BookRepository bookRepository = new BookRepositoryImpl();
//        this.bookService = new BookServiceImpl(bookRepository);
//    }

    BookController() {
        this.bookService = BookIoCContainer.getBookService();
    }

    @GetMapping("")
    public String getAll(Model model) {
        model.addAttribute("books", bookService.getAll());
        return "books";
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable int id, Model model) {
        Book book = bookService.findById(id);
        model.addAttribute("book", book);
        return "booksdetails";
    }

    @GetMapping("/form")
    public String addingBookForm() {
        return "register";
    }

    @PostMapping("/form/success")
    public String result(@RequestParam String title, @RequestParam String author, Model model) {
        Book book = new Book(0, title, author);
        model.addAttribute("book", book);
        return "result";

    }
}
