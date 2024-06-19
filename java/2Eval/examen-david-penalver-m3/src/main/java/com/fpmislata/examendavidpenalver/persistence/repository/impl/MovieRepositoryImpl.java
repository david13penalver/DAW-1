package com.fpmislata.examendavidpenalver.persistence.repository.impl;

import com.fpmislata.examendavidpenalver.domain.entity.Movie;
import com.fpmislata.examendavidpenalver.persistence.dao.MovieDao;
import com.fpmislata.examendavidpenalver.persistence.repository.MovieRepository;
import com.fpmislata.examendavidpenalver.persistence.repository.mapper.MovieMapper;

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
