package com.fpmislata.examen.persistence.repository;

import com.fpmislata.examen.domain.entity.Movie;

import java.util.List;

public interface MovieRepository {
    List<Movie> findAll();

    Movie findById(int id);
}
