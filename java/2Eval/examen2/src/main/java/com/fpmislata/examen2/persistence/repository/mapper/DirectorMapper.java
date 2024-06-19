package com.fpmislata.examen2.persistence.repository.mapper;

import com.fpmislata.examen2.domain.entity.Director;
import com.fpmislata.examen2.domain.entity.Movie;
import com.fpmislata.examen2.persistence.dao.entity.DirectorEntity;
import com.fpmislata.examen2.persistence.dao.entity.MovieEntity;

import java.util.ArrayList;
import java.util.List;

public class DirectorMapper {

    public static Director toDirector(DirectorEntity directorEntity) {
        int id = directorEntity.getId();
        String name = directorEntity.getName();

        return new Director(id, name);
    }

    public static List<Director> toDirectorList(List<DirectorEntity> directorEntityList) {
        List<Director> directorList = new ArrayList<>();

        for (DirectorEntity directorEntity : directorEntityList) {
            directorList.add(toDirector(directorEntity));
        }
        return directorList;
    }

}
