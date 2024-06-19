package com.fpmislata.examendavidpenalver.persistence.repository.mapper;

import com.fpmislata.examendavidpenalver.domain.entity.Movie;
import com.fpmislata.examendavidpenalver.persistence.dao.entity.MovieEntity;

import java.util.ArrayList;
import java.util.List;

public class MovieMapper {

    public static Movie toMovie(MovieEntity movieEntity) {
        Integer id = movieEntity.getId_movie();
        String title = movieEntity.getTitle();
        String director = movieEntity.getDirector();

        return new Movie(id, title, director);
    }

    public static List<Movie> toMovieList(List<MovieEntity> movieEntityList) {
        List<Movie> movieList = new ArrayList<>();

        for (MovieEntity movieEntity : movieEntityList) {
            movieList.add(toMovie(movieEntity));
        }
        return movieList;
    }
}
