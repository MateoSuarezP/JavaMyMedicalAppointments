package ui;

import Model.Doctor;
import Model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String [] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;
     public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    authUser(1);
                    response = 0;
                    break;
                case 2:
                    authUser(2);
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

    private static void authUser(int userType) {
         //userType = 1 Doctor
        //userType = 2 Patient

        ArrayList <Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Mateo", "ms@hotmail.com"));
        doctors.add(new Doctor("Eli", "el@hotmail.com"));
        doctors.add(new Doctor("Yuyu", "yu@hotmail.com"));

        ArrayList <Patient> patients = new ArrayList<>();
        patients.add(new Patient("Mateo", "ms@hotmail.com"));
        patients.add(new Patient("Eli", "el@hotmail.com"));
        patients.add(new Patient("Yuyu", "yu@hotmail.com"));

        boolean emailCorrect = false;

        do {
            System.out.println("insert email");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if (userType == 1) {
                for (Doctor d: doctors){
                    if (d.getEmail().equals(email)){
                        emailCorrect = true;
                        //obtener usuario loggeado
                        doctorLogged = d;
                        //showDoctorMenu
                    }
                }

            }
            if (userType == 2) {

                for (Patient p: patients) {
                    if (p.getEmail().equals(email)){
                        emailCorrect = true;
                        //obtener usuario loggeado
                        patientLogged = p;
                        //showpatientmenu
                    }
                }
            }


        } while (!emailCorrect);
    }

    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
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