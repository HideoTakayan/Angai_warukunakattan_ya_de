package University_Management.test;

import model.Subject;
import model.Lecturer;

import java.time.LocalDate;

public class SubjectTest {
    public static void main(String[] args) {
        // Tao Lecturer voi thong tin day du (dung dung constructor)
        Lecturer lecturer = new Lecturer("Nguyen Van A", LocalDate.of(1980, 5, 20), "Nam", 1);

        // Tao Subject voi Lecturer da tao
        Subject subject = new Subject(101, "Lap trinh Java", 3, lecturer);

        // In thong tin chi tiet cua Subject
        System.out.println("=== Thong tin mon hoc ===");
        System.out.println("Ma mon: " + subject.getSubjectID());
        System.out.println("Ten mon: " + subject.getSubjectName());
        System.out.println("So tin chi: " + subject.getCredits());

        // In thong tin giang vien phu trach
        System.out.println("\n=== Thong tin giang vien ===");
        System.out.println("Ma giang vien: " + lecturer.getLecturerID());
        System.out.println("Ten giang vien: " + lecturer.getName());
        System.out.println("Ngay sinh: " + lecturer.getDateOfBirth());
        System.out.println("Gioi tinh: " + lecturer.getGender());
    }
}
