package com.fpmislata.examendavidpenalver.persistence.repository;

import com.fpmislata.examendavidpenalver.domain.entity.Movie;

import java.util.List;

public interface MovieRepository {
    List<Movie> findAll();

    Movie findById(int id);
}
