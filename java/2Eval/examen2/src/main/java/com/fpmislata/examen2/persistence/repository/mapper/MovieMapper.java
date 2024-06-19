package com.fpmislata.examen2.persistence.repository.mapper;

import com.fpmislata.examen2.domain.entity.Director;
import com.fpmislata.examen2.domain.entity.Movie;
import com.fpmislata.examen2.persistence.dao.entity.MovieEntity;

import java.util.ArrayList;
import java.util.List;

public class MovieMapper {

    public static Movie toMovie(MovieEntity movieEntity) {
        int id = movieEntity.getId();
        String title = movieEntity.getTitle();
        int year = movieEntity.getYear();

        return new Movie(id, title, year);
    }

    public static List<Movie> toMovieList(List<MovieEntity> movieEntityList) {
        List<Movie> movieList = new ArrayList<>();

        for (MovieEntity movieEntity : movieEntityList) {
            movieList.add(toMovie(movieEntity));
        }
        return movieList;
    }

    public static MovieEntity toMovieEntity(Movie movie) {
        int id = movie.getId();
        String title = movie.getTitle();
        int year = movie.getYear();
        int directorId = 0;

        return new MovieEntity(id, title, year, directorId);
    }
}
