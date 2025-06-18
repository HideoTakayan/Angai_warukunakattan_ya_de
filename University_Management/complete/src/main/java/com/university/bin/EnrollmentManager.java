package bin;

import model.Enrollment;
import model.Student;
import model.Subject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EnrollmentManager {
    private List<Enrollment> enrollmentList;

    public EnrollmentManager() {
        this.enrollmentList = new ArrayList<>();
    }

    // 1. Dang ky mon hoc
    public boolean addEnrollment(Student student, Subject subject, LocalDate enrollmentDate) {
        if (isEnrolled(student.getStudentID(), subject.getSubjectID())) {
            System.out.println("Hoc sinh " + student.getStudentID() + " da dang ky mon " + subject.getSubjectID());
            return false; // Da dang ky roi
        }
        Enrollment enrollment = new Enrollment(student, subject, enrollmentDate);
        enrollmentList.add(enrollment);
        System.out.println("Da them dang ky: " + enrollment);
        return true;
    }

    // 2. Kiem tra hoc sinh da dang ky mon hoc chua
    public boolean isEnrolled(int studentID, int subjectID) {
        for (Enrollment e : enrollmentList) {
            if (e.getStudentID() == studentID && e.getSubjectID() == subjectID) {
                return true;
            }
        }
        return false;
    }

    // 3. Huy dang ky mon hoc
    public boolean cancelEnrollment(int studentID, int subjectID) {
        Iterator<Enrollment> iterator = enrollmentList.iterator();
        while (iterator.hasNext()) {
            Enrollment e = iterator.next();
            if (e.getStudentID() == studentID && e.getSubjectID() == subjectID) {
                iterator.remove();
                System.out.println("Da huy dang ky: " + e);
                return true;
            }
        }
        System.out.println("Khong tim thay dang ky cua StudentID " + studentID + " voi SubjectID " + subjectID);
        return false;
    }

    // Hien thi danh sach dang ky
    public void showAllEnrollments() {
        if (enrollmentList.isEmpty()) {
            System.out.println("Chua co dang ky nao.");
            return;
        }
        for (Enrollment e : enrollmentList) {
            System.out.println(e);
        }
    }
}
