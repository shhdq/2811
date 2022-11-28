import java.sql.*;

public class DBlogic {


    String DB = "jdbc:mysql://localhost:3306";
    String USER = "root";
    String PASS = "";

    // delete
    public void delete() {

        try {
            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt = conn.createStatement();

            String sql = "DELETE FROM users WHERE id = 1";

            stmt.executeUpdate(sql);

            System.out.println("Dati tika izdzēsti");

        } catch(SQLException e) {
            e.printStackTrace();
        }

    }

    // select/ read
    public void read() {
        try {
            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            while (rs.next()) {
                System.out.println("id: " + rs.getInt("id"));
                System.out.println("name: " + rs.getString("name"));
                System.out.println(" ");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
