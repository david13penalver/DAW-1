package com.fpmislata.examendavidpenalver.persistence.repository.mapper;

import com.fpmislata.examendavidpenalver.domain.entity.Movie;
import com.fpmislata.examendavidpenalver.persistence.dao.entity.MovieEntity;

import java.util.ArrayList;
import java.util.List;

public class MovieMapper {

    public static Movie toMovie(MovieEntity movieEntity) {
        Integer id = movieEntity.getId();
        String title = movieEntity.getTitle();

        //Aquí podríamos montar también el director
        //        Director director = DirectorMapper.toDirector(directorEntity);

        return new Movie(id, title);
    }

    public static List<Movie> toMovieList(List<MovieEntity> movieEntityList) {
        List<Movie> movieList = new ArrayList<>();

        for (MovieEntity movieEntity : movieEntityList) {
            movieList.add(toMovie(movieEntity));
        }
        return movieList;
    }
}
