package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Patient extends User {
    private String birthday;
    private String blood;
    private double weight;
    private double height;

    //Constructor
    public Patient(String name, String email, String phoneNumber, String birthday, String blood, double weight, double height) {
        super(name, email, phoneNumber);
        this.birthday = birthday;
        this.blood = blood;
        this.weight = weight;
        this.height = height;
    }

    public String getWeight () {
        return weight + " kg";
    }

    public String getHeight () {
        return height + " Mts";
    }

    @Override
    public String toString() {
        return super.toString() + "\nBirthday: " + getBirthday() + "\nBlood: " + getBlood()
            + "\nWeight: " + getWeight() + "\nHeight: " + getHeight();
    }
}
