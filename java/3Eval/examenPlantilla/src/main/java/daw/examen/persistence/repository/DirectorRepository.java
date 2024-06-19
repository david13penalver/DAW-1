package daw.examen.persistence.repository;

import daw.examen.domain.entinty.Director;

public interface DirectorRepository {
    Director findById(Integer id);
}
