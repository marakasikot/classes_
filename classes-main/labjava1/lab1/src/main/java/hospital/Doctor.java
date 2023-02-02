package hospital;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Doctor extends Person{
    public String phoneNumber;
    public int cabinetNumber;
    public int salary;
    public String position;
    public List<Patient> patients = new ArrayList<>();

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getCabinetNumber() {
        return cabinetNumber;
    }

    public void setCabinetNumber(int cabinetNumber) {
        this.cabinetNumber = cabinetNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", cabinetNumber=" + cabinetNumber +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                ", patients=" + patients +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Doctor doctor)) return false;
        if (!super.equals(o)) return false;
        return cabinetNumber == doctor.cabinetNumber && salary == doctor.salary && phoneNumber.equals(doctor.phoneNumber) && position.equals(doctor.position) && Objects.equals(patients, doctor.patients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), phoneNumber, cabinetNumber, salary, position, patients);
    }

    public static class Builder {
        private Doctor doctor;

        public Builder(){ doctor = new Doctor(); }
        /**
         * Setter type designation
         * @param firstname - name
         * @return returns current object
         */
        public Builder setFirstname(String firstname){
            doctor.firstname = firstname;
            return this;
        }

        /**
         * Setter type designation
         * @param lastname - surname
         * @return returns current object
         */
        public Builder setLastname(String lastname){
            doctor.lastname = lastname;
            return this;
        }

        /**
         * Setter type designation
         * @param dateOfBirth - date of birth
         * @return returns current object
         */
        public Builder setDateOfBirth(LocalDate dateOfBirth){
            doctor.dateOfBirth = dateOfBirth;
            return this;
        }
        /**
         * Setter type designation
         * @param phoneNumber - phone number
         * @return returns current object
         */
        public Builder setPhoneNumber(String phoneNumber){
            doctor.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * Setter type designation
         * @param cabinetNumber - number of cabinet
         * @return returns current object
         */
        public Builder setCabinetNumber(int cabinetNumber){
            doctor.cabinetNumber = cabinetNumber;
            return this;
        }

        /**
         * Setter type designation
         * @param salary - salary
         * @return returns current object
         */
        public Builder setSalary(int salary){
            doctor.salary = salary;
            return this;
        }
        /**
         * Setter type designation
         * @param patients - list of patients
         * @return returns current object
         */
        public Builder setPatients(List<Patient> patients){
            doctor.patients.addAll(patients);
            return this;
        }

        /**
         * Setter type designation
         * @param position - position
         * @return returns current object
         */
        public Builder setPosition(String position){
            doctor.position = position;
            return this;
        }

        /**
         * Function of creating an object of class "Person"
         * @return returns new object of class "Person"
         */
        public Doctor build(){
            return doctor;
        }
    }

    public static void main(String args[]) {
    }
}

