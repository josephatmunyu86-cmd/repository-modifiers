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
        System.out.println(" RECEPTIONIST");
        receptionist.viewBasicDetails(patient);

        System.out.println();

        System.out.println("DOCTOR");
        doctor.viewMedicalInformation(patient);

        System.out.println();

        System.out.println(" UPDATE MEDICAL INFORMATION ");
        doctor.updateMedicalInformation(
                patient,
                "Patient has hypertension and is responding well to treatment."
        );

        System.out.println("Medical information updated.");

        System.out.println();

        doctor.viewMedicalInformation(patient);

        System.out.println();

        System.out.println("ADMINISTRATION");
        Finance finance = new Finance(50000000);
        finance.displayFinancialRecords();
    }
}
