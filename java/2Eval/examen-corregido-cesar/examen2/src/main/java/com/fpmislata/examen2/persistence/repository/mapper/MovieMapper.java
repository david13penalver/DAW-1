package com.fpmislata.examen2.persistence.repository.mapper;

import com.fpmislata.examen2.domain.entity.Movie;
import com.fpmislata.examen2.persistence.dao.MovieDao;
import com.fpmislata.examen2.persistence.dao.entity.MovieEntity;

import java.util.ArrayList;
import java.util.List;

public class MovieMapper {

    private int od;
    private String title;
    private int year;
    private int directorId;

    public static Movie toMovie(MovieEntity movieEntity) {
        if(movieEntity == null) {
            return null;
        }
        Movie movie = new Movie(
                movieEntity.getId(),
                movieEntity.getTitle(),
                movieEntity.getYear()
        );
        return movie;
    }

    public static List<Movie> toMovieList(List<MovieEntity> movieEntityList) {
        if (movieEntityList == null) {
            return null;
        }
        List<Movie> movieList = new ArrayList<>();
        for (MovieEntity movieEntity : movieEntityList) {
            movieList.add(toMovie(movieEntity));
        }
        return movieList;
    }

}
