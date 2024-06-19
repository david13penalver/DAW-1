package daw.examen.persistence.zdao.mapper;

import daw.examen.domain.entinty.Actor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ActorMapper {
    public static Actor toActor(ResultSet resultSet) throws SQLException {

        //Integer id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        String role = resultSet.getString("role");

        return new Actor(name, role);
    }

    public static List<Actor> toActorList(ResultSet resultSet) throws SQLException {

        List<Actor> actorList = new ArrayList<>();

        while (resultSet.next()) {
            actorList.add(toActor(resultSet));
        }

        return actorList;
    }
}
