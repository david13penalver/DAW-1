package daw.examen.persistence.zdao.impl;

import daw.examen.domain.entinty.Director;
import daw.examen.persistence.zdao.DirectorDao;
import daw.examen.persistence.zdao.impl.dbconnection.RawSQL;
import daw.examen.persistence.zdao.mapper.DirectorMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DirectorDaoImpl implements DirectorDao {

    @Override
    public Director findById(Integer id) {
        String sql = "SELECT * FROM `directors` WHERE id = ?";
        List<Object> params = List.of(id);

        try {
            ResultSet resultSet = RawSQL.select(sql, params);
            if (!resultSet.next()) {
                return null;
            }
            return DirectorMapper.toDirector(resultSet);

        } catch (SQLException e) {
            throw new RuntimeException("Error to find director by id", e);
        }
    }
}
