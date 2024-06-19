package com.fpmislata.examendavidpenalver.domain.service.impl;

import com.fpmislata.examendavidpenalver.domain.entity.Music;
import com.fpmislata.examendavidpenalver.domain.service.MusicService;
import com.fpmislata.examendavidpenalver.persistence.repository.MusicRepository;

import java.util.List;

public class SingerServiceImpl implements MusicService {

    SingerR musicRepository;

    public SingerServiceImpl(MusicRepository musicRepository) {
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
