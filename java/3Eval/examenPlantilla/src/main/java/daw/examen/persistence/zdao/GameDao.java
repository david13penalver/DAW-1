package daw.examen.persistence.zdao;

import daw.examen.domain.entinty.Game;

import java.util.List;

public interface GameDao {
    List<Game> findAll();

    Game findById(String gameCode);

    List<Game> findAllByDirectorId(Integer id);

    Game create(Game game);
}
