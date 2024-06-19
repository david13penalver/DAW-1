package com.fpmislata.examen.persistence.dao;

import com.fpmislata.examen.domain.entity.Movie;
import com.fpmislata.examen.persistence.dao.entity.MovieEntity;

import java.util.List;

public interface MovieDao {
    List<MovieEntity> findAll();

    MovieEntity findById(int id);
}
