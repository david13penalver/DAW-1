package daw.examen.persistence.zdao;

import daw.examen.domain.entinty.Actor;

import java.util.List;

public interface ActorDao {
    Actor findById(Integer id);
    Actor findByName(String name);

    //List<Actor> findAllByGameId(Integer id);
}
