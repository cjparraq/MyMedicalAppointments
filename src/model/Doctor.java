package model;

import java.time.LocalDate;
import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Doctor extends User {
    //Attributes
    private String speciality;

    //Constructor
    public Doctor(String name, String email, String phoneNumber, String speciality) {
        super(name, email, phoneNumber);
        this.speciality = speciality;
    }

    //Behavior
    @Getter
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(LocalDate date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + getSpeciality() +
            "\nAvailable Appointments: " + getAvailableAppointments();
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: Cruz Roja");
        System.out.println("Departamento: Oncología");
    }

    //Inner class
    @Setter
    @Getter
    public static class AvailableAppointment {
        //attributes
        private int id;
        private LocalDate date;
        private String time;

        //Constructor
        public AvailableAppointment(LocalDate date, String time) {
            this.date = date;
            this.time = time;
        }

        //Behavior
        @Override
        public String toString() {
            return "\nDate: " +date+ " Time: " + time;
        }
    }
}


