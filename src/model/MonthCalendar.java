package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MonthCalendar {
    private List<Map<Integer, List<Patient>>> calendar;

    public MonthCalendar() {
        this.calendar = new ArrayList<>(31);
        for (int i = 0; i < 31; i++) {
            calendar.add(new HashMap<>());
            calendar.get(i).put(i + 1, new ArrayList<>());
        }
    }

    public List<Map<Integer, List<Patient>>> getCalendar() {
        return calendar;
    }

    public void setCalendar(List<Map<Integer, List<Patient>>> calendar) {
        this.calendar = calendar;
    }

    public void addPatient(int day, Patient patient) {
        if (day >= 1) {
            if (day > calendar.size()) {
                int numDaysToAdd = day - calendar.size();
                for (int i = 0; i < numDaysToAdd; i++) {
                    calendar.add(new HashMap<>());
                }
            }
            Map<Integer, List<Patient>> dayMap = calendar.get(day - 1);
            dayMap.computeIfAbsent(day, k -> new ArrayList<>()).add(patient);
        } else {
            throw new IllegalArgumentException("Invalid day.");
        }
    }

    public List<Patient> getPatientList(int day) {
        if (day >= 1 && day <= calendar.size()) {
            Map<Integer, List<Patient>> dayMap = calendar.get(day - 1);
            return dayMap.getOrDefault(day, new ArrayList<>());
        } else {
            throw new IllegalArgumentException("Invalid day.");
        }
    }

    public Patient getPatient(int day, String firstName, String lastName) {
        if (day >= 1 && day <= calendar.size()) {
            Map<Integer, List<Patient>> dayMap = calendar.get(day - 1);
            List<Patient> patients = dayMap.getOrDefault(day, new ArrayList<>());
            for (Patient patient : patients) {
                if (patient.getFirstName().equals(firstName) && patient.getLastName().equals(lastName)) {
                    return patient;
                }
            }
        }
        throw new IllegalArgumentException("Patient not found.");
    }
}
