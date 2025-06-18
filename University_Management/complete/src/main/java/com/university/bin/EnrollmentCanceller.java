package bin;

import model.Enrollment;

import java.util.Iterator;
import java.util.List;

public class EnrollmentCanceller {
    private List<Enrollment> enrollmentList;

    public EnrollmentCanceller(List<Enrollment> enrollmentList) {
        this.enrollmentList = enrollmentList;
    }

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
}
