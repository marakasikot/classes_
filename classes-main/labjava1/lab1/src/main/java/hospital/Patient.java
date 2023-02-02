package hospital;


import java.time.LocalDate;
import java.util.Objects;

/**
 * class "Patient" with fields: phoneNumber, medicalCardNumber, bloodType
 * @author User
 * @version 1.0
 */
public class Patient extends Person{
    public String phoneNumber;
    public int medicalCardNumber;
    public int bloodType;

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setMedicalCardNumber(int medicalCardNumber) {
        this.medicalCardNumber = medicalCardNumber;
    }

    public int getMedicalCardNumber() {
        return medicalCardNumber;
    }

    public void setBloodType(int bloodType) {
        this.bloodType = bloodType;
    }

    public int getBloodType() {
        return bloodType;
    }

    /**
     *  Overridden function of obtaining a string representation of
     *  an instance of a class "Patient"
     *  @return returns the string representation
     */
    @Override
    public String toString() {
        return "Patient{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", medicalCardNumber=" + medicalCardNumber +
                ", bloodType=" + bloodType +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient patient)) return false;
        if (!super.equals(o)) return false;
        return medicalCardNumber == patient.medicalCardNumber && bloodType == patient.bloodType && phoneNumber.equals(patient.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), phoneNumber, medicalCardNumber, bloodType);
    }

    public static class Builder {
        private Patient patient;

        public Builder(){ patient = new Patient(); }

        /**
         * Setter type designation
         *
         * @param firstname - name
         * @return returns current object
         */
        public Builder setFirstname(String firstname){
            patient.firstname = firstname;
            return this;
        }

        /**
         * Setter type designation
         * @param lastname - surname
         * @return returns current object
         */
        public Builder setLastname(String lastname){
            patient.lastname = lastname;
            return this;
        }

        /**
         * Setter type designation
         * @param dateOfBirth - date of birth
         * @return returns current object
         */
        public Builder setDateOfBirth(LocalDate dateOfBirth){
            patient.dateOfBirth = dateOfBirth;
            return this;
        }
        /**
         * Setter type designation
         * @param medicalCardNumber - name
         * @return returns current object
         */
        public Builder setMedicalCardNumber(int medicalCardNumber){
            patient.medicalCardNumber = medicalCardNumber;
            return this;
        }

        /**
         * Setter type designation
         * @param bloodType - surname
         * @return returns current object
         */
        public Builder setBloodType(int bloodType){
            patient.bloodType = bloodType;
            return this;
        }

        /**
         * Setter type designation
         * @param phoneNumber - date of birth
         * @return returns current object
         */
        public Builder setPhoneNumber(String phoneNumber){
            patient.phoneNumber = phoneNumber;
            return this;
        }
        /**
         * Function of creating an object of class "Patient"
         * @return returns new object of class "Patient"
         */
        public Patient build(){
            return patient;
        }
    }

    public static void main(String args[]) {
    }
}