package com.fpmislata.examendavidpenalver.persistence.repository.mapper;

import com.fpmislata.examendavidpenalver.domain.entity.Singer;
import com.fpmislata.examendavidpenalver.persistence.dao.entity.SingerEntity;

import java.util.ArrayList;
import java.util.List;

public class SingerMapper {

    public static Singer toSinger(SingerEntity singerEntity) {
        Integer id = singerEntity.getId();
        String name = singerEntity.getName();
        String surname = singerEntity.getSurname();

        return new Singer(id, name, surname);
    }

    public static List<Singer> toSingerList(List<SingerEntity> singerEntityList) {
        List<Singer> singerList = new ArrayList<>();

        for (SingerEntity singerEntity : singerEntityList) {
            singerList.add(toSinger(singerEntity));
        }
        return singerList;
    }
}
