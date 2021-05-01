package inheritanceExample;

public class Instructor extends User {

    private String courses;
    private int workExperience;

    public  Instructor() {
    }

    public Instructor(int id, String firstName, String lastName, String email, String courses, int workExperience) {
        super(id, firstName, lastName, email);
        this.courses = courses;
        this.workExperience = workExperience;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }
}
