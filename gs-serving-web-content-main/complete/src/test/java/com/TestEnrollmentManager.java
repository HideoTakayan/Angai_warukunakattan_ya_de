package University_Management.test;

import bin.EnrollmentManager;
import model.Enrollment;
import model.Lecturer;
import model.Student;
import model.Subject;

import java.time.LocalDate;

public class TestEnrollmentManager {
    public static void main(String[] args) {
        EnrollmentManager manager = new EnrollmentManager();

        // Tao Lecturer
        Lecturer lecturer = new Lecturer("Nguyen Van A", LocalDate.of(1975, 6, 15), "Male", 1);

        // Tao cac mon hoc
        Subject math = new Subject(101, "Math", 3, lecturer);
        Subject physics = new Subject(102, "Physics", 4, lecturer);

        // Tao sinh vien
        Student student1 = new Student(201, "Tran Thi B", LocalDate.of(2000, 3, 15), "Female");
        Student student2 = new Student(202, "Le Van C", LocalDate.of(1999, 7, 10), "Male");

        // Thu dang ky mon hoc
        manager.addEnrollment(student1, math, LocalDate.now());
        manager.addEnrollment(student1, physics, LocalDate.now());
        manager.addEnrollment(student2, math, LocalDate.now());

        System.out.println("\nDanh sach dang ky sau khi dang ky:");
        manager.showAllEnrollments();

        // Kiem tra dang ky
        System.out.println("\nKiem tra student1 da dang ky mon Math? " +
                manager.isEnrolled(student1.getStudentID(), math.getSubjectID()));

        System.out.println("Kiem tra student2 da dang ky mon Physics? " +
                manager.isEnrolled(student2.getStudentID(), physics.getSubjectID()));

        // Huy dang ky mon Physics cua student1
        System.out.println("\nHuy dang ky mon Physics cua student1:");
        manager.cancelEnrollment(student1.getStudentID(), physics.getSubjectID());

        System.out.println("\nDanh sach dang ky sau khi huy:");
        manager.showAllEnrollments();
    }
}
