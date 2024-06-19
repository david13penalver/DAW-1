package com.fpmislata.examen.persistence.repository.impl;

import com.fpmislata.examen.domain.entity.Movie;
import com.fpmislata.examen.persistence.dao.MovieDao;
import com.fpmislata.examen.persistence.repository.MovieRepository;
import com.fpmislata.examen.persistence.repository.mapper.MovieMapper;

import java.util.List;

public class MovieRepositoryImpl implements MovieRepository {
    private MovieDao movieDao;

    public MovieRepositoryImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @Override
    public List<Movie> findAll() {
        return MovieMapper.toMovieList(movieDao.findAll());
    }

    @Override
    public Movie findById(int id) {
        return MovieMapper.toMovie(movieDao.findById(id));
    }
}
