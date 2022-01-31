import java.util.function.Consumer;

/**
 * Costumer
 */
public class Costumer {
    private String title;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAdress;
    private String tvaNumber;

    Costumer(String t, String first, String last, String phone, String email, String tva) {
        this.title = t;
        this.firstName = first;
        this.lastName = last;
        this.phoneNumber = phone;
        this.emailAdress = email;
        this.tvaNumber = tva;
    }
}