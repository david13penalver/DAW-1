package com.fpmislata.practica1b.controller;

import com.fpmislata.practica1b.domain.entity.Book;
import com.fpmislata.practica1b.domain.service.BookService;
import com.fpmislata.practica1b.domain.service.impl.BookServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/books/")
public class BookController {

    BookService bookService = new BookServiceImpl();

    @GetMapping
    public String findAll(Model model) {
        List<Book> bookList = bookService.findAll();
        model.addAttribute("bookList", bookList);
        return "bookList";
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") int id, Model model) {
        Book book = bookService.findById(id);
        model.addAttribute("book", book);
        return "bookDetail";
    }

    @GetMapping("/new")
    public String newBook() {
        return "addBook";
    }

    @PostMapping
    public String addBook(@RequestParam("title") String title, @RequestParam("id") String id, @RequestParam("authorId") Integer authorId) {
        Book book = new Book(Integer.parseInt(id), title, null);
        bookService.insert(book, authorId);
        return "redirect:/books/";
    }


}
