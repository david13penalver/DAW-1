package com.fpmislata.examen.domain.service;

import com.fpmislata.examen.domain.entity.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> findAll();

    Movie findById(int id);
}
