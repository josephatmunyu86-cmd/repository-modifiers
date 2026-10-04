package admin;

import patient.Patient;
import doctors.Doctor;
import reception.Receptionist;

public class HospitalSystem {
    public static void main(String[] args) {
        Patient patient = new Patient(
                "John Doe",
                "15 October 2026",
                "Patient has a history of hypertension."
        );

        Doctor doctor = new Doctor("Dr. Sarah");
        Receptionist receptionist = new Receptionist("Mary");
