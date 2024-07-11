import Model.Doctor;
import Model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {


    //UIMenu.showMenu();

        Doctor myDoctor = new Doctor("Mateo", "Pediatra");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "5pm");
        myDoctor.addAvailableAppointment(new Date(), "6pm");

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());

        }

        Patient patient1 = new Patient("David", "dasupi@gmail");
        patient1.setPhoneNumber("12345678");
        System.out.println(patient1);


    }
}