package com.fpmislata.examendavidpenalver.persistence.dao.impl;

import com.fpmislata.examendavidpenalver.persistence.dao.MovieDao;
import com.fpmislata.examendavidpenalver.persistence.dao.entity.MovieEntity;

import java.util.ArrayList;
import java.util.List;

public class MovieDaoImpl implements MovieDao {

    List<MovieEntity> movieEntityList = new ArrayList<>(
            List.of(
                    new MovieEntity(1, "Star Wars IV: A New Hope", 1987, "Science Fiction", 120, "George Lucas", 8),
                    new MovieEntity(2, "The Godfather", 1972, "Drama", 175, "Francis Ford Coppola", 9),
                    new MovieEntity(3, "The Shawshank Redemption", 1994, "Drama", 142, "Frank Darabont", 9),
                    new MovieEntity(4, "The Dark Knight", 2008, "Action", 152, "Christopher Nolan", 8),
                    new MovieEntity(5, "The Lord of the Rings: The Return of the King", 2003, "Adventure", 201, "Peter Jackson", 9)
            )
    );


    @Override
    public List<MovieEntity> findAll() {
        return movieEntityList;
    }

    @Override
    public MovieEntity findById(int id) {
        for (MovieEntity movieEntity : movieEntityList) {
            if (id == movieEntity.getId_movie()) {
                return movieEntity;
            }
        }
        return null;
    }
}
