package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
//        String sql = "SELECT * FROM movies WHERE title = ?";
//        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        preparedStatement.setString(1, "Seven");
//        ResultSet resultSet = preparedStatement.executeQuery();
//        resultSet.next();
//        System.out.println(
//                "Título: " + resultSet.getString("title") +
//                "\nAño: " + resultSet.getInt("year") +
//                "\nDuración: " + resultSet.getInt("runtime") + " min\n"
//        );

        DBConnection Connection = new DBConnection();
        String sql = "SELECT * FROM movies WHERE year = ?";
        PreparedStatement preparedStatement = Connection.getConnection().prepareStatement(sql);
        preparedStatement.setInt(1, 1994);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(
                    "Título: " + resultSet.getString("title") +
                            "\nAño: " + resultSet.getInt("year") +
                            "\nDuración: " + resultSet.getInt("runtime") + " min\n"
            );
        }

        try {
            ResultSet resultSet2 = RawSql.select("SELECT * FROM movies", null);
            while (resultSet.next()) {
                System.out.println(resultSet2.getString("title"));
            }
        } catch (SQLException e) {
            System.out.println("Error al recuperar las películas");
        }

        String sql3 = """
        INSERT INTO movies (imdb_id, title, year, image, runtime, description, director_id) 
        VALUES (?, ?, ?, null, ?, null, ?)                    
    """;
        List<Object> params = List.of(
                "tt0071524", "Primera plana", 1974, 105, "nm0000697"
        );
        System.out.println("Película insertada con id " + RawSql.insert(sql3, params));
    }

}