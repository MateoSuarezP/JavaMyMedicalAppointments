package Model;

public class Nurse extends User {

    private  String speciality;


    public Nurse(String name, String email) {
        super(name, email);
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
}
