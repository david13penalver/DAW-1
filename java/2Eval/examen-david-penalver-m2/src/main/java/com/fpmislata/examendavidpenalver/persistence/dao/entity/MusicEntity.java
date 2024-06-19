package com.fpmislata.examendavidpenalver.persistence.dao.entity;

public class MusicEntity {

    Integer id;
    String title;
    String author;

    String duration;
    String MetaData;

    public MusicEntity(Integer id, String title, String author, String duration, String metaData) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.duration = duration;
        MetaData = metaData;
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

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getMetaData() {
        return MetaData;
    }

    public void setMetaData(String metaData) {
        MetaData = metaData;
    }
}
