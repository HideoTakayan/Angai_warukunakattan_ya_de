package model;

import java.time.LocalDate;

public class Lecturer extends Person {
    private int lecturerID;

    public Lecturer(String name, LocalDate dateOfBirth, String gender, int lecturerID) {
        super(name, dateOfBirth, gender);
        this.lecturerID = lecturerID;
    }

    public int getLecturerID() {
        return lecturerID;
    }

    @Override
    public String toString() {
        return lecturerID + " - " + getName();
    }
}