package daw.examen.persistence.zdao.mapper;

import daw.examen.domain.entinty.Actor;
import daw.examen.domain.entinty.Director;
import daw.examen.domain.entinty.Game;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GameMapper {
    public static Game toGame(ResultSet resultSet) throws SQLException {

        Integer id = resultSet.getInt("id");
        String game_code = resultSet.getString("game_code");
        String title = resultSet.getString("title");
        Integer year = resultSet.getInt("release_year");
        String description = resultSet.getString("description");
        Director director = null;
        List<Actor> actorList = new ArrayList<>();


        return new Game(id, game_code, title, year, description, director, actorList);

    }

    public static List<Game> toGameList(ResultSet resultSet) throws SQLException {

        List<Game> gameList = new ArrayList<>();

        while (resultSet.next()) {
            gameList.add(toGame(resultSet));
        }

        return gameList;
    }
}
