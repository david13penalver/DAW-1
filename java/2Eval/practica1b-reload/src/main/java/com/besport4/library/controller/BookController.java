package com.besport4.library.controller;

import com.besport4.library.domain.entity.Book;
import com.besport4.library.domain.service.BookService;
import com.besport4.library.domain.service.impl.BookServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books")
public class BookController {

    BookService bookService = new BookServiceImpl();

    @GetMapping("")
    public String getAll(Model model) {
        model.addAttribute("books", bookService.getAll());
        return "books";
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable int id, Model model) {
        model.addAttribute("book", bookService.findById(id));
        return "bookdetails";
    }

    @GetMapping("/form")
    public String form () {
        return "form";
    }

    @PostMapping("/form")
    public String formResult(@RequestParam String title, @RequestParam String author, Model model) {
        Book book = new Book(0, title, author);
        model.addAttribute("book", book);
        return "formresult";
    }
}
