import java.sql.*;
import java.util.List;

public class RawSQL {
    private static final DBConnection dbConnection = new DBConnection();

    public static ResultSet select(String sql, List<Object> params) {
        try {
            PreparedStatement preparedStatement = setParameters(sql, params);
            return preparedStatement.executeQuery();
        } catch (Exception e) {
            throw new RuntimeException("Error executing SQL query: " + sql);
        }
    }

    public static ResultSet selectAllMovies() {
        String sql = "SELECT * FROM movies"; // Ajusta esta consulta según la estructura de tu base de datos
        return select(sql, null);
    }

    private static PreparedStatement setParameters(String sql, List<Object> values){
        try {
            Connection connection = dbConnection.getConnection();
            PreparedStatement preparedStatement =  connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            if(values != null) {
                for(int i=0;i<values.size();i++) {
                    Object value = values.get(i);
                    preparedStatement.setObject(i+1,value);
                }
            }
            return preparedStatement;
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static Object insert(String sql, List<Object> params) {
        try {
            PreparedStatement preparedStatement = setParameters(sql, params);
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if(resultSet.next()){
                return resultSet.getObject(1);
            } else {
                throw new RuntimeException("Unable to retrieve the last generated ID");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error executing SQL query:" + sql);
        }
    }

    public static int update(String sql, List<Object> params) {
        return RawSQL.statement(sql, params);
    }

    public static int delete(String sql, List<Object> params) {
        return RawSQL.statement(sql, params);
    }


    private static int statement(String sql, List<Object> params) {
        try {
            PreparedStatement preparedStatement = setParameters(sql, params);
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("Error executing SQL query: " + sql);
        }
    }
}
