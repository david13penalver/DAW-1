package com.fpmislata.examen2.repository.dao;

import com.fpmislata.examen2.repository.dao.entity.MovieEntity;

import java.util.List;

public interface MovieDao {
    List<MovieEntity> findAll();

    MovieEntity findById(int id);
}
