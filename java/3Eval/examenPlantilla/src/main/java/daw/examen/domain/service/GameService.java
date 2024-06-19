package daw.examen.domain.service;

import daw.examen.domain.entinty.Game;

import java.util.List;

public interface GameService {
    List<Game> findAll();

    Game findById(String gameCode);

    List<Game> findByDirectorId(Integer id);

    Game create(Game game);
}
