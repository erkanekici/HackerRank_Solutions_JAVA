package inheritanceExample;

public class UserManager {

    public void add(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + "(" + user.getId() + ")" + " " + "Başarıyla eklendi.");
    }

    public void login(User user) {
        System.out.println(user.getFirstName() + user.getLastName() + " Başarıyla giriş yaptınız.");
    }

    public void displayInfo(User user) {
        System.out.println("Kullanıcının Bilgileri:");
        System.out.println("id: " + user.getId());
        System.out.println("İsim: " + user.getFirstName() + " " + user.getLastName());
        System.out.println("email: " + user.getEmail());
    }

    public void addMultiple(User[] users) {
        for (User user : users) {
            add(user);
        }
    }
}

