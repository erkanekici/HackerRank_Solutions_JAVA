package inheritanceExample;

public class InstructorManager extends UserManager {

    public void displayInfo(Instructor instructor) {
        System.out.println("Eğitmenin Bilgileri:");
        System.out.println("id: " + instructor.getId());
        System.out.println("İsim: " + instructor.getFirstName() + " " + instructor.getLastName());
        System.out.println("email: " + instructor.getEmail());
        System.out.println("Eğitmenin Verdiği Kurslar: " + instructor.getCourses());
        System.out.println("İş deneyimi: " + instructor.getWorkExperience() + " yıl");
    }

    public void displayCourses(Instructor instructor) {
        System.out.println("Eğitmenin Verdiği Kurslar Gösterildi:");

    }
}
