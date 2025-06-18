package University_Management.test;

import bin.EnrollmentAdder;
import bin.EnrollmentChecker;
import bin.EnrollmentCanceller;

import model.Enrollment;
import model.Student;
import model.Subject;
import model.Lecturer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestEnrollmentClasses {
    public static void main(String[] args) {
        // Tạo list chung dùng cho cả 3 class
        List<Enrollment> enrollmentList = new ArrayList<>();

        // Khởi tạo 3 class với cùng list này
        EnrollmentAdder adder = new EnrollmentAdder(enrollmentList);
        EnrollmentChecker checker = new EnrollmentChecker(enrollmentList);
        EnrollmentCanceller canceller = new EnrollmentCanceller(enrollmentList);

        // Tạo Lecturer
        Lecturer lecturer = new Lecturer("Nguyen Van A", LocalDate.of(1975, 6, 15), "Male", 1);

        // Tạo Subject
        Subject math = new Subject(101, "Math", 3, lecturer);
        Subject physics = new Subject(102, "Physics", 4, lecturer);

        // Tạo Student
        Student student1 = new Student(201, "Tran Thi B", LocalDate.of(2000, 3, 15), "Female");
        Student student2 = new Student(202, "Le Van C", LocalDate.of(1999, 7, 10), "Male");

        // Test đăng ký môn học (EnrollmentAdder)
        System.out.println("== Them dang ky ==");
        adder.addEnrollment(student1, math, LocalDate.now());
        adder.addEnrollment(student1, physics, LocalDate.now());
        adder.addEnrollment(student2, math, LocalDate.now());

        // Test kiểm tra đăng ký (EnrollmentChecker)
        System.out.println("\n== Kiem tra dang ky ==");
        System.out.println(
                "Student1 da dang ky mon Math? " + checker.isEnrolled(student1.getStudentID(), math.getSubjectID()));
        System.out.println("Student2 da dang ky mon Physics? "
                + checker.isEnrolled(student2.getStudentID(), physics.getSubjectID()));

        // Test hủy đăng ký (EnrollmentCanceller)
        System.out.println("\n== Huy dang ky mon Physics cua student1 ==");
        canceller.cancelEnrollment(student1.getStudentID(), physics.getSubjectID());

        // In danh sách còn lại
        System.out.println("\n== Danh sach dang ky con lai ==");
        for (Enrollment e : enrollmentList) {
            System.out.println(e);
        }
    }
}
