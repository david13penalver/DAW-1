package com.fpmislata.examen2.repository.repository.mapper;

import com.fpmislata.examen2.domain.entity.Director;
import com.fpmislata.examen2.repository.dao.entity.DirectorEntity;

public class DirectorMapper {

    public static Director toDirector(DirectorEntity directorEntity) {
        if (directorEntity == null) {
            return null;
        }
        Director director = new Director(
                directorEntity.getId(),
                directorEntity.getName()
        );
        return director;
    }


}
