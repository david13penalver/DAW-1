package com.fpmislata.examen.domain.service;

import com.fpmislata.examen.domain.entity.Music;

import java.util.List;

public interface MusicService {
    List<Music> findAll();

    Music findById(int id);

    void insert(Music music);
}
