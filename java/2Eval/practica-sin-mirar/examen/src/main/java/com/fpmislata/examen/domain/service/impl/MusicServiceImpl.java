package com.fpmislata.examen.domain.service.impl;

import com.fpmislata.examen.domain.entity.Music;
import com.fpmislata.examen.domain.service.MusicService;
import com.fpmislata.examen.persistence.MusicRepository;
import com.fpmislata.examen.persistence.impl.MusicRepositoryImpl;

import java.util.List;

public class MusicServiceImpl implements MusicService {

    MusicRepository musicRepository = new MusicRepositoryImpl();
    @Override
    public List<Music> findAll() {
        return musicRepository.findAll();
    }

    @Override
    public Music findById(int id) {
        return musicRepository.findById(id);
    }

    @Override
    public void insert(Music music) {
        musicRepository.insert(music);
    }
}
