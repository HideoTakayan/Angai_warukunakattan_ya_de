package model;

public class Subject {
    private int subjectID;
    private String subjectName;
    private int credits;
    private Lecturer lecturer;

    public Subject() {
    }

    public Subject(int subjectID, String subjectName, int credits, Lecturer lecturer) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.credits = credits;
        this.lecturer = lecturer;
    }

    // Getter và Setter
    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    @Override
    public String toString() {
        return String.format("%d - %s - %s", subjectID, subjectName, lecturer.getName());
    }
}
