package daw.examen.persistence.repository.impl;

import daw.examen.common.IoC.ActorIoC;
import daw.examen.common.IoC.DirectorIoC;
import daw.examen.domain.entinty.Actor;
import daw.examen.domain.entinty.Director;
import daw.examen.domain.entinty.Game;
import daw.examen.persistence.repository.GameRepository;
import daw.examen.persistence.zdao.ActorDao;
import daw.examen.persistence.zdao.DirectorDao;
import daw.examen.persistence.zdao.GameDao;

import java.util.ArrayList;
import java.util.List;



public class GameRepositoryImpl implements GameRepository {
    private GameDao gameDao;
    DirectorDao directorDao;
    ActorDao actorDao;
    public GameRepositoryImpl(GameDao gameDao) {
        this.gameDao = gameDao;
        directorDao = DirectorIoC.getDirectorDao();
        actorDao = ActorIoC.getActorDao();
    }
    @Override
    public List<Game> findAll() {
        return gameDao.findAll();
    }

    @Override
    public Game findById(String gameCode) {
        Game game = gameDao.findById(gameCode);

        // Add Director
        Director director = directorDao.findById(game.getId());
        game.setDirector(director);

        // Add Actors
//        List<Actor> actorList = actorDao.findAllByGameId(game.getId());
//        game.setActorList(actorList);


        return game;
    }

    @Override
    public List<Game> findAllByDirectorId(Integer id) {
        List<Game> gameList = gameDao.findAllByDirectorId(id);
        return gameList;
    }

    @Override
    public Game create(Game game) {
        return gameDao.create(game);
    }
}
