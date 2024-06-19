package daw.examen.persistence.zdao.impl;

import daw.examen.common.tools.Color;
import daw.examen.domain.entinty.Actor;
import daw.examen.domain.entinty.Director;
import daw.examen.domain.entinty.Game;
import daw.examen.persistence.zdao.GameDao;
import daw.examen.persistence.zdao.impl.dbconnection.RawSQL;
import daw.examen.persistence.zdao.mapper.GameMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class GameDaoImpl implements GameDao {
    @Override
    public List<Game> findAll() {
        String sql = "SELECT * FROM `games`";
        List<Object> params = List.of();

        try {
            return GameMapper.toGameList(RawSQL.select(sql, params));

        } catch (SQLException e) {
            throw new RuntimeException(Color.RED + "DAO: Error to find all games" + Color.RESET, e);
        }
    }

    @Override
    public Game findById(String gameCode) {
        String sql = "SELECT * FROM `games` WHERE game_code LIKE ?";
        List<Object> params = List.of(gameCode);

        try {
            ResultSet resultSet = RawSQL.select(sql, params);
            if (!resultSet.next()) {
                return null;
            }
            return GameMapper.toGame(resultSet);

        } catch (SQLException e) {
            throw new RuntimeException(Color.RED + "DAO: Error to find game by game code" + Color.RESET, e);
        }
    }

    @Override
    public List<Game> findAllByDirectorId(Integer id) {
        String sql = "SELECT * FROM `games` JOIN `directors` ON games.director_Id = directors.id WHERE directors.id = ?";
        List<Object> params = List.of(id);
        try {
            return GameMapper.toGameList(RawSQL.select(sql, params));

        } catch (SQLException e) {
            throw new RuntimeException(Color.RED + "DAO: Error to find all games by director id" + Color.RESET, e);
        }
    }

    @Override
    public Game create(Game game) {
        String sql = "INSERT INTO `games` ('id, `game_code`, `title`, `year`, `description`) VALUES (10, ?, ?, ?, ?)";
        List<Object> params = List.of(
                "MI3-2022",
                "Return to Monkey Island",
                2022,
                "A new adventure of Guybrush Threepwood"
        );
        RawSQL.insert(sql, params, true);
        return game;

//        try {
//            RawSQL.insert(sql, params);
//            return game;
//
//        } catch (SQLException e) {
//            throw new RuntimeException(Color.RED + "DAO: Error to create game" + Color.RESET, e);
//        }
    }
}
