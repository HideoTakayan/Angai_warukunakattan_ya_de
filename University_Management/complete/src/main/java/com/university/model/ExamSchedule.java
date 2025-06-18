package model;

public class ExamSchedule {
    private int subjectId;
    private String examDate;
    private String session;

    public ExamSchedule(int subjectId, String examDate, String session) {
        this.subjectId = subjectId;
        this.examDate = examDate;
        this.session = session;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public String getExamDate() {
        return examDate;
    }

    public String getSession() {
        return session;
    }

    @Override
    public String toString() {
        return "Môn học ID: " + subjectId + ", Ngày thi: " + examDate + ", Ca thi: " + session;
    }
}
