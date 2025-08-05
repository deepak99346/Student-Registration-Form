import java.sql.*;

public class RegisterStudent {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database";
        String user = "root";
        String pass = "your_password";

        String name = "John Doe";
        String email = "john@example.com";
        String phone = "9876543210";

        try {
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "INSERT INTO students (name, email, phone) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, phone);

            stmt.executeUpdate();
            System.out.println("Student registered successfully!");
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
