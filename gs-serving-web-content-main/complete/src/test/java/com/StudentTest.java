package University_Management.test;

import model.Student;

import java.time.LocalDate;
import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(1001, "An", LocalDate.of(2002, 5, 10), "Male");
        Student s2 = new Student(1002, "Binh", LocalDate.of(2001, 3, 15), "Male");
        Student s3 = new Student(1003, "Chi", LocalDate.of(2003, 7, 20), "Female");

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println("Danh sach sinh vien ban dau:");
        for (Student s : students) {
            System.out.println(s);
        }

        students.sort(Comparator.comparing(Student::getName));

        System.out.println("\nDanh sach sinh vien sau khi sap xep:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
