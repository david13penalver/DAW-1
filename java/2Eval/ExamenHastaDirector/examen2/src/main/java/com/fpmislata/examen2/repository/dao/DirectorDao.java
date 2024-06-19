package com.fpmislata.examen2.repository.dao;

import com.fpmislata.examen2.repository.dao.entity.DirectorEntity;

public interface DirectorDao {
    DirectorEntity findById(int directorId);
}
