package com.fpmislata.examendavidpenalver.persistence.dao;

import com.fpmislata.examendavidpenalver.persistence.dao.entity.MovieEntity;

import java.util.List;

public interface MovieDao {
    List<MovieEntity> findAll();
}
