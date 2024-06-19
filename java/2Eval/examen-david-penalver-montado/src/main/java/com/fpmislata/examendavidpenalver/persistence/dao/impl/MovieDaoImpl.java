package com.fpmislata.examendavidpenalver.persistence.dao.impl;

import com.fpmislata.examendavidpenalver.domain.entity.Movie;
import com.fpmislata.examendavidpenalver.persistence.dao.MovieDao;
import com.fpmislata.examendavidpenalver.persistence.dao.entity.MovieEntity;

import java.util.List;

public class MovieDaoImpl implements MovieDao {

    private List<MovieEntity> movieList = List.of(
            new MovieEntity(1, "Peli 1", "a1", "b1"),
            new MovieEntity(2, "Peli 2", "a2", "b2"),
            new MovieEntity(3, "Peli 3", "a3", "b3")
    );

    public List<MovieEntity> findAll() {
        return movieList;
    }
}
