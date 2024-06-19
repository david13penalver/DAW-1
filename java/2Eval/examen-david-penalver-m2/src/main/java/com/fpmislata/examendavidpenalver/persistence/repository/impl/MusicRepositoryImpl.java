package com.fpmislata.examendavidpenalver.persistence.repository.impl;

import com.fpmislata.examendavidpenalver.domain.entity.Music;
import com.fpmislata.examendavidpenalver.persistence.dao.MusicDao;
import com.fpmislata.examendavidpenalver.persistence.dao.impl.MusicDaoImpl;
import com.fpmislata.examendavidpenalver.persistence.repository.MusicRepository;
import com.fpmislata.examendavidpenalver.persistence.repository.mapper.MusicMapper;

import java.util.List;

public class MusicRepositoryImpl implements MusicRepository {

    MusicDao musicDao;

    public MusicRepositoryImpl(MusicDao musicDao) {
        this.musicDao = musicDao;
    }

    @Override
    public List<Music> findAll() {
        return MusicMapper.toMusicList(musicDao.findAll());
    }

    @Override
    public Music findById(int id) {
        return MusicMapper.toMusic(musicDao.findById(id));
    }
}
