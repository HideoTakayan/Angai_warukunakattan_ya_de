package bin;

import model.Enrollment;

import java.util.List;

public class EnrollmentChecker {
    private List<Enrollment> enrollmentList;

    public EnrollmentChecker(List<Enrollment> enrollmentList) {
        this.enrollmentList = enrollmentList;
    }

    public boolean isEnrolled(int studentID, int subjectID) {
        for (Enrollment e : enrollmentList) {
            if (e.getStudentID() == studentID && e.getSubjectID() == subjectID) {
                return true;
            }
        }
        return false;
    }
}
