package com.fpmislata.examendavidpenalver.persistence.dao;

import com.fpmislata.examendavidpenalver.persistence.dao.entity.MovieEntity;

import java.util.List;

public interface MovieDao {

    public List<MovieEntity> findAll();

    MovieEntity findById(int id);
}
