package inheritanceExample;

import inheritanceExample.manager.InstructorManager;
import inheritanceExample.manager.StudentManager;
import inheritanceExample.manager.UserManager;
import inheritanceExample.model.Instructor;
import inheritanceExample.model.Student;
import inheritanceExample.model.User;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setId(1);
        student1.setFirstName("Hakan");
        student1.setLastName("Ekici");
        student1.setEmail("Hakan@gmail.com");
        student1.setStudentNumber(123);
        student1.setCoursesAttended("Java+React");

        Student student2 = new Student(2, "Mert", "Ceylan", "Mert@gmail.com", 456, "C#");
        Student student3 = new Student(3, "Murat", "Bayram", "Murat@gmail.com", 789, "Java+React,C#");

        StudentManager studentManager = new StudentManager();
        studentManager.displayInfo(student1);
        studentManager.displayProgress(student2);

        Instructor instructor1 = new Instructor(4, "Engin", "Demiroğ", "Engin@gmail.com", "Java+React - C#", 15);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.displayInfo(instructor1);
        instructorManager.displayCourses(instructor1);

        User[] users = {student1, student2, student3, instructor1};

        UserManager userManager = new UserManager();
        userManager.addMultiple(users);
        userManager.login(student1);
        userManager.displayInfo(student2);

    }
}
