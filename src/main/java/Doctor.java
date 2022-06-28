public class Doctor {
    private String firstname;
    private String lastname;
    private String post;

    public Doctor(String firstname, String lastname, String post) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.post = post;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void getDoctorInfo(){
        System.out.println(firstname+" "+lastname+" "+post);
    }
}
