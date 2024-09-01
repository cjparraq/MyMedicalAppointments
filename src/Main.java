import java.time.LocalDate;
import model.Doctor;
import model.Patient;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n----- My Medical Appointments -----\n");

        //showMenu();



        Doctor myDoctor = new Doctor(
            "Anahí Salgado",
            "anahi@gmail.com",
            "0123456789",
            "Pediatric");

        myDoctor.addAvailableAppointment(LocalDate.of(2024, 8, 15), "4pm");
        myDoctor.addAvailableAppointment(LocalDate.of(2024, 8, 31), "6pm");

        Patient myPatient = new Patient(
            "Cristian",
            "cris@gmail.com",
            "1234567890",
            "01/04/1993",
            "A+",
            70.0,
            1.80);

        System.out.println(myDoctor);
        System.out.println();
        System.out.println(myPatient);


    }
}
