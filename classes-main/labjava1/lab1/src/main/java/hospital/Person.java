package hospital;

import java.time.LocalDate;
import java.util.Objects;
/**
 * class "Person" with fields: firstname, lastname, dateOfBirth
 * @author User
 * @version 1.0
 */
public class Person {
    public String firstname;
    public String lastname;
    public LocalDate dateOfBirth;

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getFirstname() {
        return firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getLastname() {
        return lastname;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    /**
     *  Overridden function of obtaining a string representation of
     *  an instance of a class "Person"
     *  @return returns the string representation
     */
    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
    /**
     * Overridden function of comparison an instance of
     * the class "Person" and an instance of the class "Object"
     * @return returns the boolean value of the comparison
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(firstname, person.firstname) && Objects.equals(lastname, person.lastname) && Objects.equals(dateOfBirth, person.dateOfBirth);
    }
    /**
     * Overridden function of obtaining the hash code
     * @return returns the numeric value of the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, dateOfBirth);
    }
    /**
     * Class "Builder" with fields: order
     * @author User
     * @version 1.0
     */

    public static class Builder {
        private Person person;

        public Builder(){ person = new Person(); }
        /**
         * Setter type designation
         * @param firstname - name
         * @return returns current object
         */
        public Builder setFirstname(String firstname){
            person.firstname = firstname;
            return this;
        }

        /**
         * Setter type designation
         * @param lastname - surname
         * @return returns current object
         */
        public Builder setLastname(String lastname){
            person.lastname = lastname;
            return this;
        }

        /**
         * Setter type designation
         * @param dateOfBirth - date of birth
         * @return returns current object
         */
        public Builder setDateOfBirth(LocalDate dateOfBirth){
            person.dateOfBirth = dateOfBirth;
            return this;
        }
        /**
         * Function of creating an object of class "Person"
         * @return returns new object of class "Person"
         */
        public Person build(){
            return person;
        }
    }

    public static void main(String args[]) {
    }

}

