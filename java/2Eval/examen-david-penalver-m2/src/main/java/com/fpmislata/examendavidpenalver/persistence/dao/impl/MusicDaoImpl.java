package com.fpmislata.examendavidpenalver.persistence.dao.impl;

import com.fpmislata.examendavidpenalver.persistence.dao.MusicDao;
import com.fpmislata.examendavidpenalver.persistence.dao.entity.MusicEntity;

import java.util.ArrayList;
import java.util.List;

public class MusicDaoImpl implements MusicDao {

    List<MusicEntity> musicEntityList = new ArrayList<>(
            List.of(
                    new MusicEntity(1, "T1", "A1", "180", "fhwoeibf"),
                    new MusicEntity(2, "T2", "A1", "190", "fhwoeibf"),
                    new MusicEntity(3, "T1-1", "A2", "240", "fhwoeibf"),
                    new MusicEntity(4, "T2-1", "A3", "250", "fhwoeibf")
            )
    );


    @Override
    public List<MusicEntity> findAll() {
        return musicEntityList;
    }

    @Override
    public MusicEntity findById(int id) {
        for (MusicEntity musicEntity : musicEntityList) {
            if (id == musicEntity.getId()) {
                return musicEntity;
            }
        }
        return null;
    }
}
