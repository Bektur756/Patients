package model;

import java.time.LocalDate;

public class Patient {
    private String time;
    private String firstName;
    private String lastName;
    private String patientType;
    private String symptoms;
    private LocalDate birthday;

    public Patient(String time, String firstName, String lastName, String patientType, String symptoms, LocalDate birthday) {
        this.time = time;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patientType = patientType;
        this.symptoms = symptoms;
        this.birthday = birthday;
    }

    // Getters and setters for the fields

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    // Override toString() method to provide a custom string representation of the object

    @Override
    public String toString() {
        return "Patient{" +
                "time='" + time + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patientType='" + patientType + '\'' +
                ", symptoms='" + symptoms + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
