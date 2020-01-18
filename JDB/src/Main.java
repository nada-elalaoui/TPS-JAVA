import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","nadou","nadapl");
        System.out.println(connection.isValid(1000));
        String selectUserQuery = "SELECT * FROM EMP";
        Statement selectStatement = connection.createStatement();
        ResultSet selectResult = selectStatement.executeQuery(selectUserQuery);
        while (selectResult.next()) {
            System.out.println(selectResult.getInt("empno") +" : "+ selectResult.getString("Ename"));
        }
        selectResult.close();
        selectStatement.close();
        connection.close();

    }
}
