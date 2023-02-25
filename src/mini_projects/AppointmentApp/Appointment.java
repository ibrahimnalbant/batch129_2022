package mini_projects.AppointmentApp;
//6-Randevu:
//            -id : otomatik üretilsin,unique(eşsiz)
//            -hasta adı,Doktor,randevu tarihi
public class Appointment {

    private static int counter=0;
    private int id;
    private String name;
    private Doctor doctor;//dr name, branşı
    private String date;

    public Appointment(String name, Doctor doctor, String date) {
        counter++;
        this.id =counter;
        this.name = name;
        this.doctor = doctor;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
