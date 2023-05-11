import java.sql.*;

public class LAB9 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb1";
        String username = "root";
        String password = "mysql@sit";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            Connection connection= DriverManager.getConnection(URL, username, password);
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO student(studentID ,firstName,lastName,email,deptID)" + "VALUES(4,'Leng','Mark','lol@gmail.com','10245')";
            statement.executeUpdate(sql);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

