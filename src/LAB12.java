import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB12 {

    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb1";
        String username = "root";
        String password = "mysql@sit";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, username, password);
            String sql = "insert into student(idstudent,firstName,lastName,email,deptId)" + "values(?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "111233214");
            preparedStatement.setString(2, "Mhom");
            preparedStatement.setString(3, "TheREalOne");
            preparedStatement.setString(4, "MhomGeeGee@gmail.com");
            preparedStatement.setString(5, "IT");
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB12.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB12.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}