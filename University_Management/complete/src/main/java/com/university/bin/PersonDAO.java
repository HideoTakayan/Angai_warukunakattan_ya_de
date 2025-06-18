package bin;

import model.Person;
import model.Student;
import model.Lecturer;

import java.util.ArrayList;
import java.util.List;

public class PersonDAO {
    private List<Person> people = new ArrayList<>();

    public void addPerson(Person person) {
        people.add(person);
    }

    public void updateNameById(int id, String newName) {
        for (Person p : people) {
            if (p instanceof Student && ((Student) p).getStudentID() == id) {
                p.setName(newName);
                return;
            } else if (p instanceof Lecturer && ((Lecturer) p).getLecturerID() == id) {
                p.setName(newName);
                return;
            }
        }
    }

    public void deleteById(int id) {
        people.removeIf(p -> (p instanceof Student && ((Student) p).getStudentID() == id) ||
                (p instanceof Lecturer && ((Lecturer) p).getLecturerID() == id));
    }

    public Person getById(int id) {
        for (Person p : people) {
            if (p instanceof Student && ((Student) p).getStudentID() == id) {
                return p;
            } else if (p instanceof Lecturer && ((Lecturer) p).getLecturerID() == id) {
                return p;
            }
        }
        return null;
    }

    public List<Person> getAllPeople() {
        return people;
    }
}
