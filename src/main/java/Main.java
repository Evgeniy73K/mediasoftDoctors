import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        List<Doctor> doctors = new ArrayList<>();
        List<Reception> receptionList = new ArrayList<>();
        if(Authentication.authenticate() == 0) {
            Scanner sc = new Scanner(System.in);
            int value;
            do {
                System.out.println("1-Create doctor");
                System.out.println("2-Create patient");
                System.out.println("3-Create reception");
                System.out.println("4-Change reception status");
                System.out.println("5-Get patient reception");
                System.out.println("6-Get all patients");
                System.out.println("7-Edit patient");
                System.out.println("8-Delete patient");
                System.out.println("9-exit");
                System.out.println("Type command: ");
                value = sc.nextInt();
                switch (value) {
                    case 1:
                        String doctorName;
                        String doctorLastname;
                        String post;
                        System.out.println("Type firstname");
                        doctorName = sc.next();
                        System.out.println("Type lastname");
                        doctorLastname = sc.next();
                        System.out.println("Type post");
                        post = sc.next();
                        Doctor doctor = new Doctor(doctorName, doctorLastname, post);
                        doctors.add(doctor);
                        break;

                    case 2:
                        String patientName;
                        String patientLastName;
                        System.out.println("Type firstname");
                        patientName = sc.next();
                        System.out.println("Type lastname");
                        patientLastName = sc.next();
                        Patient patient = new Patient(patientName, patientLastName, Date.from(Instant.now()));
                        patients.add(patient);
                        break;
                    case 3:
                        String date;
                        int doctorId;
                        int patientId;
                        String status;
                        try {
                        System.out.println("Type date");
                        date = sc.next();
                        System.out.println("Type doctor id");
                        doctorId = sc.nextInt();
                        Doctor selectDoctor = doctors.get(doctorId);
                        System.out.println("Type patient id");
                        patientId = sc.nextInt();
                        Patient selectPatient = patients.get(patientId);
                        System.out.println("Select status");
                        status = sc.next();
                        Reception reception = new Reception(selectDoctor, selectPatient, date, status);
                        receptionList.add(reception); } catch (Exception e){
                            System.out.println("Invalid data try again");
                        }

                        break;
                    case 4:
                        int receptionId;
                        String newStatus;
                        try {
                        System.out.println("Type reception id");
                        receptionId = sc.nextInt();
                        System.out.println("Type new status");
                        newStatus = sc.next();
                        receptionList.get(receptionId).setStatus(newStatus);
                        break;} catch (Exception e) {
                            System.out.println("Invalid data try again");
                        }
                    case 5:
                        try{
                        System.out.println("Type patient id");
                        patientId = sc.nextInt();
                        for(int i = 0; i < receptionList.size(); i++){
                            if(receptionList.get(i).getPatient() == patients.get(patientId)){
                                System.out.println("Patient firstname: "+ receptionList.get(i).getPatient().getFirstname());
                                System.out.println("Patient lastname: "+ receptionList.get(i).getPatient().getLastname());
                                System.out.println("Visit date: "+ receptionList.get(i).getDate());
                                System.out.println("Doctor: "+ receptionList.get(i).getDoctor().getFirstname() + " "+  receptionList.get(i).getDoctor().getLastname());
                                System.out.println("Visit status: " + receptionList.get(i).getStatus());
                            }
                        }


                        break;} catch (Exception e){
                            System.out.println("Invalid data try again");
                        }
                    case 6:
                        for (int i = 0; i < patients.size(); i ++){
                            System.out.println("Id: "+ i + " Patient name: "+ patients.get(i).getFirstname()+ " Patient lastname: "+ patients.get(i).getLastname() + " Register/edit date: "+ patients.get(i).getDate());

                        }
                        break;
                    case 7:
                        try{
                        System.out.println("Type patientId");
                        patientId = sc.nextInt();
                        System.out.println("Type firstname");
                        patientName = sc.next();
                        System.out.println("Type lastname");
                        patientLastName = sc.next();
                        patients.set(patientId, new Patient(patientName, patientLastName, Date.from(Instant.now())));
                        break;} catch (Exception e) {
                            System.out.println("Invalid data try again");
                        }
                    case 8:
                        try {
                        System.out.println("Type patientId");
                        patientId = sc.nextInt();
                        patients.remove(patientId);
                        break;} catch (Exception e){
                            System.out.println("Invalid data try again");
                        }
                    case 9:
                        System.out.println("Exit");
                        break;

                }

            } while (value != 9);


        }else {
            System.out.println("fail");

        }

    }
}
