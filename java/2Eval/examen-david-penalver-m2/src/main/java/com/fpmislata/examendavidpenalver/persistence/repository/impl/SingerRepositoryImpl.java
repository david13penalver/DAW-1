package com.fpmislata.examendavidpenalver.persistence.repository.impl;

import com.fpmislata.examendavidpenalver.domain.entity.Music;
import com.fpmislata.examendavidpenalver.persistence.dao.MusicDao;
import com.fpmislata.examendavidpenalver.persistence.dao.SingerDao;
import com.fpmislata.examendavidpenalver.persistence.repository.MusicRepository;
import com.fpmislata.examendavidpenalver.persistence.repository.SingerRepository;
import com.fpmislata.examendavidpenalver.persistence.repository.mapper.MusicMapper;

import java.util.List;

import static com.fpmislata.examendavidpenalver.common.container.MusicIoC.musicDao;

public class SingerRepositoryImpl implements SingerRepository {

    SingerDao singerDao;

    public SingerRepositoryImpl(MusicDao musicDao) {
        this.singerDao = musicDao;
    }

    @Override
    public List<Music> findAll() {
        return MusicMapper.toMusicList(singerDao.findAll());
    }

    @Override
    public Music findById(int id) {
        return MusicMapper.toMusic(singerDao.findById(id));
    }
}
