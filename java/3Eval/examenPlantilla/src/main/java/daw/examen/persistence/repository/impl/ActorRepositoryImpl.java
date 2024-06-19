package daw.examen.persistence.repository.impl;

import daw.examen.domain.entinty.Actor;
import daw.examen.persistence.repository.ActorRepository;
import daw.examen.persistence.zdao.ActorDao;

public class ActorRepositoryImpl implements ActorRepository {
    private ActorDao actorDao;

    public ActorRepositoryImpl(ActorDao actorDao) {
        this.actorDao = actorDao;
    }

    @Override
    public Actor findById(Integer id) {
        return actorDao.findById(id);
    }


}
