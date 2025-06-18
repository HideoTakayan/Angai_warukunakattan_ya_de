package com.university.bin;

import com.university.model.Person;
import com.university.model.Student;
import com.university.model.Lecturer;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO {

    // Thêm 1 người vào DB
    public void addPerson(Person person) {
        String sql = "INSERT INTO persons (name, date_of_birth, gender) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, person.getName());
            stmt.setDate(2, Date.valueOf(person.getDateOfBirth()));
            stmt.setString(3, person.getGender());

            stmt.executeUpdate();
            System.out.println("Thêm người thành công!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Lấy tất cả người từ DB
    public List<Person> getAllPeople() {
        List<Person> people = new ArrayList<>();
        String sql = "SELECT * FROM persons";

        try (Connection conn = DatabaseConnection.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                LocalDate dob = rs.getDate("date_of_birth").toLocalDate();
                String gender = rs.getString("gender");

                Person p = new Person(id, name, dob, gender); // constructor của bạn
                people.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return people;
    }

    // Xóa người theo ID
    public void deleteById(int id) {
        String sql = "DELETE FROM persons WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Đã xóa người có ID: " + id);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Cập nhật tên theo ID
    public void updateNameById(int id, String newName) {
        String sql = "UPDATE persons SET name = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, newName);
            stmt.setInt(2, id);
            stmt.executeUpdate();
            System.out.println("Đã cập nhật tên cho ID: " + id);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Lấy người theo ID
    public Person getById(int id) {
        String sql = "SELECT * FROM persons WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String name = rs.getString("name");
                LocalDate dob = rs.getDate("date_of_birth").toLocalDate();
                String gender = rs.getString("gender");

                return new Person(id, name, dob, gender);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
