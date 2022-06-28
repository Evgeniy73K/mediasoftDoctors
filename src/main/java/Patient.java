import java.text.SimpleDateFormat;
import java.util.Date;
public class Patient {
    private String firstname;
    private String lastname;
    private Date date = new Date();
    private int id;
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");


    public Patient(String firstname, String lastname, Date date) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.date = date;
    }





    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDate() {
        return formatter.format(date);
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
