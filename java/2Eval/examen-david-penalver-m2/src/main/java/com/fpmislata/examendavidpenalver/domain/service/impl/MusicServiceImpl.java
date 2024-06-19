package com.fpmislata.examendavidpenalver.domain.service.impl;

import com.fpmislata.examendavidpenalver.domain.entity.Music;
import com.fpmislata.examendavidpenalver.domain.service.MusicService;
import com.fpmislata.examendavidpenalver.persistence.repository.MusicRepository;
import com.fpmislata.examendavidpenalver.persistence.repository.impl.MusicRepositoryImpl;

import java.util.List;

public class MusicServiceImpl implements MusicService {

    MusicRepository musicRepository;

    public MusicServiceImpl(MusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }
    @Override
    public List<Music> findAll() {
        return musicRepository.findAll();
    }

    @Override
    public Music findById(int id) {
        return musicRepository.findById(id);
    }
}
