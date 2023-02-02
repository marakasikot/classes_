import hospital.*;

import javax.print.Doc;
import java.time.LocalDate;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient.Builder()
                .setFirstname("Maksym")
                .setLastname("Kotsiuba")
                .setDateOfBirth(LocalDate.of(1997, 5, 18))
                .setBloodType(-1)
                .setMedicalCardNumber(11)
                .setPhoneNumber("0678680475").build();

        System.out.println(patient1);
        List<Patient> patientList = List.of(patient1);
        Doctor doctor = new Doctor.Builder()
                .setFirstname("Melice")
                .setLastname("Moreau")
                .setDateOfBirth(LocalDate.of(1999, 5, 14))
                .setPatients(patientList)
                .setPosition("Surgeon")
                .setPhoneNumber("0667833082")
                .setCabinetNumber(11)
                .setSalary(25000).build();
        System.out.println(doctor);

        List<Doctor> doctorList = List.of(doctor);

        Hospital hospital = new Hospital.Builder()
                .setAddress("Holovna 121")
                .setNumber(1)
                .setDoctors(doctorList).build();

        System.out.println(hospital);


    }

}
