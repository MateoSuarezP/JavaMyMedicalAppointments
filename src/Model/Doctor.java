package Model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    private String speciality;


    public Doctor(String name, String email) {
        super(name, email);
        System.out.println("El nombre del Model.Doctor asignado es " + name);
        this.speciality = speciality;
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado Hospital: Sanitas");
        System.out.println("Departamento: Nutrición");
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment (String date, String time) {
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    public static class AvailableAppointment {

        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(String date, String time) {
            this.date = date;
            this.time = time;


        }
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

}
