package com.fpmislata.examendavidpenalver.persistence.dao.entity;

public class MovieEntity {

    private Integer id_movie;
    private String title;
    private int year;
    private String genre;
    private double duration;
    private String director;
    private int valoration;

    public MovieEntity(Integer id_movie, String title, int year, String genre, double duration, String director, int valoration) {
        this.id_movie = id_movie;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.duration = duration;
        this.director = director;
        this.valoration = valoration;
    }

    @Override
    public String toString() {
        return "MovieEntity{" +
                "id_movie=" + id_movie +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", duration=" + duration +
                ", director='" + director + '\'' +
                ", valoration=" + valoration +
                '}';
    }

    public Integer getId_movie() {
        return id_movie;
    }

    public void setId_movie(Integer id_movie) {
        this.id_movie = id_movie;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getValoration() {
        return valoration;
    }

    public void setValoration(int valoration) {
        this.valoration = valoration;
    }
}
