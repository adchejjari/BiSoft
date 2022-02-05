
public class User {
    private String firsName;
    private String familyName;
    private String userName;
    private String password;

    public User(String fn, String ln, String un, String pw) {
        this.firsName = fn;
        this.familyName = ln;
        this.userName = un;
        this.password = pw;
    }

    public void setUsername(String newUsername) {
        this.userName = newUsername;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }
}
