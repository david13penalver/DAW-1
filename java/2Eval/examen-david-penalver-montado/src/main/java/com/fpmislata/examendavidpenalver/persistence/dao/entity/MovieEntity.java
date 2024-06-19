package com.fpmislata.examendavidpenalver.persistence.dao.entity;

public class MovieEntity {
    private Integer id;
    private String title;
    private String thing1;
    private String thing2;

    public MovieEntity(Integer id, String title, String thing1, String thing2) {
        this.id = id;
        this.title = title;
        this.thing1 = thing1;
        this.thing2 = thing2;
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

    public String getThing1() {
        return thing1;
    }

    public void setThing1(String thing1) {
        this.thing1 = thing1;
    }

    public String getThing2() {
        return thing2;
    }

    public void setThing2(String thing2) {
        this.thing2 = thing2;
    }
}
