package daw.examen.domain.service.impl;

import daw.examen.common.IoC.ActorIoC;
import daw.examen.common.IoC.DirectorIoC;
import daw.examen.common.exception.ExamException;
import daw.examen.domain.entinty.Director;
import daw.examen.domain.entinty.Game;
import daw.examen.domain.service.GameService;
import daw.examen.persistence.repository.GameRepository;

import java.util.List;

public class GameServiceImpl implements GameService {
    private GameRepository gameRepository;
    public GameServiceImpl(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }
    @Override
    public List<Game> findAll() {
        return gameRepository.findAll();
    }

    @Override
    public Game findById(String gameCode) {
        Game game = gameRepository.findById(gameCode);
        if (game == null) {
            throw new ExamException("This game does not exist");
        }

        return gameRepository.findById(gameCode);
    }

    @Override
    public List<Game> findByDirectorId(Integer id) {
        return gameRepository.findAllByDirectorId(id);
    }

    @Override
    public Game create(Game game) {
        return gameRepository.create(game);
    }
}
