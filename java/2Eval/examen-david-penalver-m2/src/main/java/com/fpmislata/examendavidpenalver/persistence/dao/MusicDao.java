package com.fpmislata.examendavidpenalver.persistence.dao;

import com.fpmislata.examendavidpenalver.persistence.dao.entity.MusicEntity;

import java.util.List;

public interface MusicDao {

    List<MusicEntity> findAll();

    MusicEntity findById(int id);
}
