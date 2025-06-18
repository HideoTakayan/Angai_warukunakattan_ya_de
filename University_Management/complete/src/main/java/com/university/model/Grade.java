package model;

public class Grade {
    private int studentID;
    private int subjectId;
    private double score;

    public Grade(int studentID, int subjectId, double score) {
        this.studentID = studentID;
        this.subjectId = subjectId;
        this.score = score;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
