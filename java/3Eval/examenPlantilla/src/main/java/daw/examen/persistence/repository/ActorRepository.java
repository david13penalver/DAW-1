package daw.examen.persistence.repository;

import daw.examen.domain.entinty.Actor;

public interface ActorRepository {
    Actor findById(Integer id);
}
