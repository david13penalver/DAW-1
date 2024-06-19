package com.fpmislata.examen2.persistence.repository.mapper;

import com.fpmislata.examen2.domain.entity.Director;
import com.fpmislata.examen2.domain.entity.Movie;
import com.fpmislata.examen2.persistence.dao.entity.DirectorEntity;
import com.fpmislata.examen2.persistence.dao.entity.MovieEntity;

public class DirectorMapper {

    int id;
    String name;

    public static Director toDirector(DirectorEntity directorEntity) {
        if(directorEntity == null) {
            return null;
        }
        Director director = new Director(
                directorEntity.getId(),
                directorEntity.getName()
        );
        return director;
    }

    public DirectorMapper() {
    }

    public DirectorMapper(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
