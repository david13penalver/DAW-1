package com.fpmislata.examen2.persistence.dao;

import com.fpmislata.examen2.persistence.dao.entity.DirectorEntity;

public interface DirectorDao {
    DirectorEntity findById(int id);
}
