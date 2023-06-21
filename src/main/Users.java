package mainpackage;

public class Users {
    private String password;
    private String name;
    private String username;

    public Users(String password, String name, String username) {
        this.password = password;
        this.name = name;
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String newUsername) {
        this.username = newUsername;
    }

    public void login() {
        System.out.println("Ο χρήστης συνδέθηκε");
    }

    public void logout() {
        System.out.println("Ο χρήστης αποσυνδέθηκε  ");
    }
}
