package ui;

import java.util.ArrayList;
import java.util.Scanner;
import model.Doctor;
import model.Nurse;
import model.Patient;

public class UIMenu {

    public static String[] MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static Doctor doctorLogged;
    public static Nurse nurseLogged;
    public static Patient patientLogged;

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Select the desired option");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Nurse");
            System.out.println("3. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    authUser(1);
                    response = 0;
                    break;
                case 2:
                    System.out.println("Nurse");
                    authUser(2);
                    response = 0;
                    break;
                case 3:
                    System.out.println("Patient");
                    authUser(3);
                    //showPatientMenu();
                    response = 0;
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    private static void authUser(int userType){
        //userType = 1 Doctor
        //userType = 2 Patient

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Martinez", "alejandroM@gmail.com", "1234567890", "Pediatric"));
        doctors.add(new Doctor("Karen Sosa", "karenS@gmail.com", "1234567890", "Dentist"));
        doctors.add(new Doctor("Rocio Gomez", "rocioG@gmail.com", "1234567890", "General"));

        ArrayList<Nurse> nurses = new ArrayList<>();
        nurses.add(new Nurse("Ana Maria Rojas", "anaR@gmail.com", "1234567890", "Nutritional"));
        nurses.add(new Nurse("Camila Martinez", "camilaM@gmail.com", "1234567890", "Pediatric"));
        nurses.add(new Nurse("Johana Mora", "johanaM@gmail.com", "1234567890", "General"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Cristian Parra", "cristianP@gmail.com", "1234567890", "13/04/1993", "A+", 70.0, 1.80));
        patients.add(new Patient("Sebastian Ochoa", "sebastianO@gmail.com", "1234567890", "15/10/1993", "A+", 70.0, 1.80));
        patients.add(new Patient("Andres Perez", "andresPerez@gmail.com", "1234567890", "3/06/1993", "A+", 70.0, 1.80));

        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email: [xxxx@xxxx.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            if (userType == 1) {
               for (Doctor d : doctors) {
                   if (d.getEmail().equals(email)) {
                       emailCorrect = true;
                       doctorLogged = d;
                       System.out.println("-- success Login --");
                       //showDoctorMenu
                   }
               }
            }

            if (userType == 2) {
                for (Nurse n : nurses) {
                    if (n.getEmail().equals(email)) {
                        emailCorrect = true;
                        System.out.println("-- success Login --");
                        nurseLogged = n;
                        //showNurseMenu
                    }
                }
            }

            if (userType == 3) {
                for (Patient p : patients) {
                    if (p.getEmail().equals(email)) {
                        emailCorrect = true;
                        System.out.println("-- success Login --");
                        patientLogged = p;
                        //showPatientMenu
                    }
                }
            }
        } while (!emailCorrect);

    }

    private static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 0; i < 3; i++) {
                        System.out.println(i +". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }

}


