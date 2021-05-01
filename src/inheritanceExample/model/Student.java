package inheritanceExample.model;

public class Student extends User {
    private int studentNumber;
    private String coursesAttended;

    public Student() {
    }

    public Student(int id, String firstName, String lastName, String email, int studentNumber, String coursesAttended) {
        super(id, firstName, lastName, email);
        this.studentNumber = studentNumber;
        this.coursesAttended = coursesAttended;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getCoursesAttended() {
        return coursesAttended;
    }

    public void setCoursesAttended(String coursesAttended) {
        this.coursesAttended = coursesAttended;
    }
}
