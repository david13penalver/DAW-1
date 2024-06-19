package com.fpmislata.examendavidpenalver.persistence.dao;

import com.fpmislata.examendavidpenalver.persistence.dao.entity.MusicEntity;
import com.fpmislata.examendavidpenalver.persistence.dao.entity.SingerEntity;

import java.util.List;

public interface SingerDao {

    List<SingerEntity> findAll();

    SingerEntity findById(int id);
}
