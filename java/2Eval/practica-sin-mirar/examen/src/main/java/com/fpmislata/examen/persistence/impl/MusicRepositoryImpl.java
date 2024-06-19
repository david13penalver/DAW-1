package com.fpmislata.examen.persistence.impl;

import com.fpmislata.examen.domain.entity.Music;
import com.fpmislata.examen.persistence.MusicRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MusicRepositoryImpl implements MusicRepository {
    List<Music> musicList = new ArrayList<>(
            List.of(
                    new Music(1, "Hola", "Autor 1"),
                    new Music(2, "Adión", "Autor 2")
            )
    );
    @Override
    public List<Music> findAll() {
        return musicList;
    }

    @Override
    public Music findById(int id) {
        for (Music music : musicList) {
            if (id == music.getId()) {
                return music;
            }
        }
        return null;
    }

    @Override
    public void insert(Music music) {
        musicList.add(music);
    }
}
