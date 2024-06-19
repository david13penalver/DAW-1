package daw.examen.persistence.repository;

import daw.examen.domain.entinty.Game;

import java.util.List;

public interface GameRepository {
    List<Game> findAll();

    Game findById(String gameCode);

    List<Game> findAllByDirectorId(Integer id);

    Game create(Game game);
}
