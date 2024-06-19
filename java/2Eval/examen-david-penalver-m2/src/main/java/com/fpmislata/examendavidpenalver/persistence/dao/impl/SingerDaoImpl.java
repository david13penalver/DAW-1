package com.fpmislata.examendavidpenalver.persistence.dao.impl;

import com.fpmislata.examendavidpenalver.persistence.dao.SingerDao;
import com.fpmislata.examendavidpenalver.persistence.dao.entity.MusicEntity;
import com.fpmislata.examendavidpenalver.persistence.dao.entity.SingerEntity;

import java.util.ArrayList;
import java.util.List;

public class SingerDaoImpl implements SingerDao {

    List<SingerEntity> singerEntityList = new ArrayList<>(
            List.of(
                    new SingerEntity(1, "Name1", "Surname1"),
                    new SingerEntity(2, "Name2", "Surname2"),
                    new SingerEntity(3, "Name3", "Surname3"),
                    new SingerEntity(4, "Name4", "Surname4")
            )
    );

    public List<SingerEntity> findAll() {
        return singerEntityList;
    }

    public SingerEntity findById(int id) {
        for (SingerEntity singerEntity : singerEntityList) {
            if (id == singerEntity.getId()) {
                return singerEntity;
            }
        }
        return null;
    }
}
