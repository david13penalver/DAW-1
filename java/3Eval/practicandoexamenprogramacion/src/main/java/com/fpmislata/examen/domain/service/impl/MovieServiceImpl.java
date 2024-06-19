package com.fpmislata.examen.domain.service.impl;

import com.fpmislata.examen.common.container.MovieIoC;
import com.fpmislata.examen.domain.entity.Movie;
import com.fpmislata.examen.domain.service.MovieService;
import com.fpmislata.examen.persistence.repository.MovieRepository;

import java.util.List;

public class MovieServiceImpl implements MovieService {
    private MovieRepository movieRepository;
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Movie findById(int id) {
        return movieRepository.findById(id);
    }
}
