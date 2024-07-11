package Model;

public class Patient extends User {

    private String birthday;
    private double weight;
    private double height;
    private String bloodType;

    public Patient(String name, String email) {
        super(name, email);
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial clinico");
    }


    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return weight + " Kg.";
    }

    public String getHeight() {
        return height + " Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
}
