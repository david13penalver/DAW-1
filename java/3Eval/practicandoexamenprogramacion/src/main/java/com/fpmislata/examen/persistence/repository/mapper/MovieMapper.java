package com.fpmislata.examen.persistence.repository.mapper;

import com.fpmislata.examen.domain.entity.Movie;
import com.fpmislata.examen.persistence.dao.entity.MovieEntity;

import java.util.ArrayList;
import java.util.List;

public class MovieMapper {
    public static Movie toMovie(MovieEntity movieEntity) {
        return new Movie(movieEntity.getId(), movieEntity.getTitle(), movieEntity.getYear(), movieEntity.getDirectorId());
    }

    public static List<Movie> toMovieList(List<MovieEntity> movieEntityList) {
        List<Movie> movieList = new ArrayList<>();
        for (MovieEntity movieEntity : movieEntityList) {
            movieList.add(toMovie(movieEntity));
        }
        return movieList;
    }
}
