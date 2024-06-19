package com.fpmislata.practica1b.domain.entity;

import org.springframework.stereotype.Controller;

import java.util.List;

public class Book {
    private Integer id;
    private String title;
    private Author author;

    public Book(Integer id, String title, Author author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }
}
