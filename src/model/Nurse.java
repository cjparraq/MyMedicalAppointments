package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Nurse extends User {

    private String speciality;

    public Nurse(String name, String email, String phoneNumber, String speciality) {
        super(name, email, phoneNumber, "Nurse");
        this.speciality = speciality;
    }
}
