package javaadday4;

import java.sql.*;
import java.util.ArrayList;

public class StudentDAO {

    public void Insert(Student s) throws SQLException {
        String sql = "INSERT INTO Student(sname, age) VALUES (?, ?)";

        try (Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, s.sname);
            ps.setInt(2, s.age);
            ps.executeUpdate();
            System.out.println("Insert successfully!");
        }
    }

    public ArrayList<Student> GetAll() throws SQLException {
        String sql = "SELECT * FROM Student";
        ArrayList<Student> list = new ArrayList<>();

        try (Connection conn = DBConnection.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Student s = new Student(
                        rs.getInt("id"),
                        rs.getString("sname"),
                        rs.getInt("age")
                );
                list.add(s);
            }
        }
        return list;
    }
}
