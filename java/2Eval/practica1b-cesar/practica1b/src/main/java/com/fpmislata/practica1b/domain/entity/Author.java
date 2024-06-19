package com.fpmislata.practica1b.domain.entity;

public class Author {
    private Integer id;
    private String name;
    private String surname;
    private String birthDate;
    private String birthPlace;

    public Author(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }
}
