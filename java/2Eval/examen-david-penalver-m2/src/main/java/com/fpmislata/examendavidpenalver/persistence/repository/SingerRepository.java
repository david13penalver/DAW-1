package com.fpmislata.examendavidpenalver.persistence.repository;

import com.fpmislata.examendavidpenalver.domain.entity.Music;

import java.util.List;

public interface SingerRepository {
    List<Music> findAll();

    Music findById(int id);
}
