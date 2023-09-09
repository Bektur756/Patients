import model.MonthCalendar;
import model.Patient;
import schedule.Schedule;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            new Schedule("localhost", 9889).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        MonthCalendar monthCalendar = new MonthCalendar();
//
//        Patient patient1 = new Patient("9:00 AM", "John", "Doe", "Type A", "Fever", LocalDate.of(1990, 5, 15));
//        Patient patient2 = new Patient("2:30 PM", "Jane", "Smith", "Type B", "Cough", LocalDate.of(1985, 9, 20));
//        Patient patient3 = new Patient("11:15 AM", "Alice", "Johnson", "Type A", "Headache", LocalDate.of(1978, 3, 10));
//        Patient patient4 = new Patient("4:45 PM", "Bob", "Thompson", "Type C", "Fatigue", LocalDate.of(1995, 7, 25));
//
//        monthCalendar.addPatient(5, patient1);
//        monthCalendar.addPatient(5, patient2);
//        monthCalendar.addPatient(10, patient3);
//        monthCalendar.addPatient(15, patient4);
//
//        List<Patient> patientsOnDay5 = monthCalendar.getPatients(5);
//        System.out.println("Patients on day 5: " + patientsOnDay5);
//
//        List<Patient> patientsOnDay15 = monthCalendar.getPatients(15);
//        System.out.println("Patients on day 15: " + patientsOnDay15);
    }
}