package model;

import java.util.regex.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email, String phoneNumber) {
        this.name = name;
        setPhoneNumber(phoneNumber);
        setEmail(email);
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 10) {
            throw new IllegalArgumentException("El número de teléfono no es válido");
        }
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("El correo no es válido");
        }
        this.email = email;
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }

    @Override
    public String toString() {
        return "UserName: " + name + "\nEmail: " + email;
    }
}
