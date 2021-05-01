package inheritanceExample.manager;

import inheritanceExample.model.Student;

public class StudentManager extends UserManager {

    public void displayProgress(Student student) {
        System.out.println("Öğrencinin kurs ilerlemesi gösterildi.");
    }

    public void displayInfo(Student student) {
        System.out.println("Öğrencinin Bilgileri:");
        System.out.println("id: " + student.getId());
        System.out.println("İsim: " + student.getFirstName() + " " + student.getLastName());
        System.out.println("email: " + student.getEmail());
        System.out.println("Öğrenci No: " + student.getStudentNumber());
        System.out.println("Katıldığı Kurslar: " + student.getCoursesAttended());
    }

}
