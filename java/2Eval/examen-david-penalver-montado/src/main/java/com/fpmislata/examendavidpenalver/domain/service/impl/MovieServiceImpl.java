package com.fpmislata.examendavidpenalver.domain.service.impl;

import com.fpmislata.examendavidpenalver.common.container.MovieIoC;
import com.fpmislata.examendavidpenalver.domain.entity.Movie;
import com.fpmislata.examendavidpenalver.domain.service.MovieService;
import com.fpmislata.examendavidpenalver.persistence.repository.MovieRepository;

import java.util.List;

public class MovieServiceImpl implements MovieService {

    MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }
}
