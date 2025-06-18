package model;

import java.time.LocalDate;

public class Enrollment {
    private Student student;
    private Subject subject;
    private LocalDate enrollmentDate;

    public Enrollment(Student student, Subject subject, LocalDate enrollmentDate) {
        this.student = student;
        this.subject = subject;
        this.enrollmentDate = enrollmentDate;
    }

    // Lấy studentID từ đối tượng Student
    public int getStudentID() {
        return student.getStudentID();
    }

    // Lấy subjectID từ đối tượng Subject
    public int getSubjectID() {
        return subject.getSubjectID();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    @Override
    public String toString() {
        return String.format("StudentID: %d, SubjectID: %d, EnrollmentDate: %s",
                getStudentID(), getSubjectID(), enrollmentDate);
    }
}
