import java.sql.*;

public class LAB11 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb1";
        String username = "root";
        String password = "mysql@sit";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(URL, username, password);
            Statement statement = connection.createStatement();
            String sql = "DELETE FROM student WHERE studentID = 4";
            statement.executeUpdate(sql);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

