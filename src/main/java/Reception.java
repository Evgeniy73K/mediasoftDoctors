import java.util.Date;

public class Reception {
    private Doctor doctor;
    private Patient patient;
    private String date;
    private String status;

    public Reception(Doctor doctor, Patient patient, String date, String status) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.status = status;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
