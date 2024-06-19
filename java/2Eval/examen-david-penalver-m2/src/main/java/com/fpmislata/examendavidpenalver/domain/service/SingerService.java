package com.fpmislata.examendavidpenalver.domain.service;

import com.fpmislata.examendavidpenalver.domain.entity.Music;

import java.util.List;

public interface SingerService {
    List<Music> findAll();

    Music findById(int id);
}
