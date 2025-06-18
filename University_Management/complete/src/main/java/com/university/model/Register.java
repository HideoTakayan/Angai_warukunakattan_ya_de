package model;

import java.time.LocalDate;
import java.util.List;

public class Register {

    public boolean register(Student student, Subject subject, List<Enrollment> enrollments) {
        // Kiểm tra nếu đã đăng ký rồi
        for (Enrollment e : enrollments) {
            if (e.getStudentID() == student.getStudentID() &&
                e.getSubjectID() == subject.getSubjectID()) {
                System.out.println("⚠️ Sinh viên đã đăng ký môn học này rồi: " + subject.getSubjectName());
                return false;
            }
        }

        // Nếu chưa -> tạo đăng ký mới
        Enrollment newEnrollment = new Enrollment(student, subject, LocalDate.now());

        enrollments.add(newEnrollment);
        System.out.println("✅ Đăng ký thành công môn: " + subject.getSubjectName());
        return true;
    }
}
