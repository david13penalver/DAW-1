package com.fpmislata.examendavidpenalver.domain.entity;

public class Music {
    Integer id;
    String title;
    String author;
    Singer singer;

    public Music(Integer id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Music(Integer id, String title, String author, Singer singer) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.singer = singer;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
