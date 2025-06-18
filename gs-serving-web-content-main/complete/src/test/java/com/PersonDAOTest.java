package University_Management.test;

import model.Student;
import model.Lecturer;
import model.Person;
import bin.PersonDAO;

import java.time.LocalDate;
import java.util.List;

public class PersonDAOTest {
    public static void main(String[] args) {
        PersonDAO service = new PersonDAO();

        // ===== CRUD SINH VIEN =====
        System.out.println("===== CRUD SINH VIEN =====");

        Student sv1 = new Student(101, "Nguyen Van A", LocalDate.of(2001, 3, 15), "Nam");
        Student sv2 = new Student(102, "Tran Thi B", LocalDate.of(2002, 7, 22), "Nu");

        // CREATE
        service.addPerson(sv1);
        service.addPerson(sv2);
        System.out.println("== Danh sach sinh vien sau khi them ==");
        hienThiTatCa(service);

        // READ
        System.out.println("\n== Lay sinh vien theo ID 101 ==");
        System.out.println(service.getById(101));

        // UPDATE
        System.out.println("\n== Cap nhat ten sinh vien co ID 102 ==");
        service.updateNameById(102, "Tran Thi B Moi");
        hienThiTatCa(service);

        // DELETE
        System.out.println("\n== Xoa sinh vien co ID 101 ==");
        service.deleteById(101);
        hienThiTatCa(service);

        // ===== CRUD GIANG VIEN =====
        System.out.println("\n===== CRUD GIANG VIEN =====");

        Lecturer gv1 = new Lecturer("Le Van C", LocalDate.of(1975, 5, 5), "Nam", 201);
        Lecturer gv2 = new Lecturer("Pham Thi D", LocalDate.of(1980, 8, 30), "Nu", 202);

        // CREATE
        service.addPerson(gv1);
        service.addPerson(gv2);
        System.out.println("== Danh sach sau khi them giang vien ==");
        hienThiTatCa(service);

        // READ
        System.out.println("\n== Lay giang vien theo ID 202 ==");
        System.out.println(service.getById(202));

        // UPDATE
        System.out.println("\n== Cap nhat ten giang vien co ID 201 ==");
        service.updateNameById(201, "Le Van C Moi");
        hienThiTatCa(service);

        // DELETE
        System.out.println("\n== Xoa giang vien co ID 202 ==");
        service.deleteById(202);
        hienThiTatCa(service);
    }

    private static void hienThiTatCa(PersonDAO service) {
        List<Person> ds = service.getAllPeople();
        if (ds.isEmpty()) {
            System.out.println("Danh sach trong.");
        } else {
            for (Person p : ds) {
                System.out.println(p);
            }
        }
    }
}
