package bin;
import model.Enrollment;
import model.Subject;
import model.Student;
import java.time.LocalDate;
import java.util.List;

public class EnrollmentAdder {
    private List<Enrollment> enrollments;

    // ✅ Thêm constructor phù hợp
    public EnrollmentAdder(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    // ✅ Thêm phương thức addEnrollment
    public void addEnrollment(Student student, Subject subject, LocalDate date) {
        for (Enrollment e : enrollments) {
            if (e.getStudentID() == student.getStudentID() &&
                e.getSubjectID() == subject.getSubjectID()) {
                System.out.println("⚠️ Sinh viên đã đăng ký môn học này rồi: " + subject.getSubjectName());
                return;
            }
        }

        Enrollment newEnrollment = new Enrollment(student, subject, date);
        enrollments.add(newEnrollment);
        System.out.println("✅ Đăng ký thành công môn: " + subject.getSubjectName());
    }

    // ✅ Vẫn giữ phương thức register nếu bạn cần dùng
    public boolean register(Student student, Subject subject, List<Enrollment> enrollments) {
        for (Enrollment e : enrollments) {
            if (e.getStudentID() == student.getStudentID() &&
                e.getSubjectID() == subject.getSubjectID()) {
                System.out.println("⚠️ Sinh viên đã đăng ký môn học này rồi: " + subject.getSubjectName());
                return false;
            }
        }

        Enrollment newEnrollment = new Enrollment(student, subject, LocalDate.now());
        enrollments.add(newEnrollment);
        System.out.println("✅ Đăng ký thành công môn: " + subject.getSubjectName());
        return true;
    }
}
