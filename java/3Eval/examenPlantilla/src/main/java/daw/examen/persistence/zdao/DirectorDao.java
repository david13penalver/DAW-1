package daw.examen.persistence.zdao;

import daw.examen.domain.entinty.Director;

public interface DirectorDao {
    Director findById(Integer id);
}
