package com.fpmislata.examen2.domain.entity;

public class Movie {

    int id;
    String title;
    Director director;

    public Movie(int id, String title, Director director) {
        this.id = id;
        this.title = title;
        this.director = director;
    }

    public Movie(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
}
