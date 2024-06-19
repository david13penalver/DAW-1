package com.fpmislata.examen.persistence;

import com.fpmislata.examen.domain.entity.Music;

import java.util.List;

public interface MusicRepository {
    List<Music> findAll();

    Music findById(int id);

    void insert(Music music);
}
