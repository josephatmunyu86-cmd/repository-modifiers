package reception;

import patient.Patient;

public class Receptionist {
    public class Receptionist {
        private String receptionistName;

        public Receptionist(String receptionistName) {
            this.receptionistName = receptionistName;
        }
        public void viewBasicDetails(Patient patient) {
            System.out.println("Receptionist: " + receptionistName);
            System.out.println("Patient Name: " + patient.getName());
            System.out.println("Appointment Date: " + patient.getAppointmentDate());
        }
}
