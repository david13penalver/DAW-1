package com.fpmislata.examen2.repository.repository;

import com.fpmislata.examen2.domain.entity.Movie;

import java.util.List;

public interface MovieRepository {
    List<Movie> findAll();

    Movie findById(int id);
}
