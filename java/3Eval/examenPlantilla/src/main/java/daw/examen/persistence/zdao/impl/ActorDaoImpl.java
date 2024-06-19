package daw.examen.persistence.zdao.impl;

import daw.examen.domain.entinty.Actor;
import daw.examen.persistence.zdao.ActorDao;
import daw.examen.persistence.zdao.impl.dbconnection.RawSQL;
import daw.examen.persistence.zdao.mapper.ActorMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ActorDaoImpl implements ActorDao {
    @Override
    public Actor findById(Integer id) {
        String sql = "SELECT * FROM `characters`  WHERE id = ?";
        List<Object> params = List.of(id);

        try {
            ResultSet resultSet = RawSQL.select(sql, params);
            if (!resultSet.next()) {
                return null;
            }
            return ActorMapper.toActor(resultSet);

        } catch (SQLException e) {
            throw new RuntimeException("Error to find actor by id", e);
        }
    }

    @Override
    public Actor findByName(String name) {
        String sql = "SELECT * FROM `characters` WHERE name = ?";
        List<Object> params = List.of(name);

        try {
            ResultSet resultSet = RawSQL.select(sql, params);
            if (!resultSet.next()) {
                return null;
            }
            return ActorMapper.toActor(resultSet);

        } catch (SQLException e) {
            throw new RuntimeException("Error to find actor by name", e);
        }
    }

//    @Override
//    public List<Actor> findAllByGameId(Integer id) {
//        String sql = "SELECT characters.* FROM `characters` JOIN `games_characters` ON characters.id = games_characters.character_id WHERE games_character.game_id = ?";
//        List<Object> params = List.of(id);
//
//        try {
//            ResultSet resultSet = RawSQL.select(sql, params);
//            return ActorMapper.toActorList(resultSet);
//        } catch (SQLException e) {
//            throw new RuntimeException("Error to find all characters by game id", e);
//        }
//    }
}
