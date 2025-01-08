
package emergencyroomadmissions;
import java.util.ArrayList;
import java.util.Scanner;

public class EmergencyRoomAdmissions {

    private static final String USERNAME = "Admin";
    private static final String PASSWORD = "St@a77";

    private static class Patient {
        String name;
        int age;
        String gender;

        Patient(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getGender() {
            return gender;
        }

        public String checkEligibility() {
            return "Eligibility not defined for generic patient";
        }
    }

    private static class FemalePatient extends Patient {
        FemalePatient(String name, int age) {
            super(name, age, "Female");
        }

        @Override
        public String checkEligibility() {
            return (age >= 18) ? "Transfer to DBN Hospital" : "Not eligible for treatment";
        }
    }

    private static class MalePatient extends Patient {
        boolean hasChronicDisorder;

        MalePatient(String name, int age, boolean hasChronicDisorder) {
            super(name, age, "Male");
            this.hasChronicDisorder = hasChronicDisorder;
        }

        @Override
        public String checkEligibility() {
            if (age > 18) {
                return hasChronicDisorder ? "Transfer to JHB Hospital" : "Transfer to DBN Hospital";
            }
            return "Not eligible for treatment";
        }
    }

    private static ArrayList<Patient> patients = new ArrayList<>();

    static {
        patients.add(new FemalePatient("Samantha", 16));
        patients.add(new MalePatient("Johnny", 19, false));
        patients.add(new MalePatient("Sam", 18, false));
        patients.add(new MalePatient("Ricky", 20, false));
        patients.add(new MalePatient("Brock", 16, false));
        patients.add(new FemalePatient("Julia", 15));
        patients.add(new FemalePatient("Tricksi", 20));
        patients.add(new FemalePatient("Stephanie", 21));
    }

    public static boolean login(String username, String password) {
        return USERNAME.equals(username) && PASSWORD.equals(password);
    }

    public static Patient searchPatient(String name) {
        for (Patient patient : patients) {
            if (patient.getName().equalsIgnoreCase(name)) {
                return patient;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to St. City Hospital Admission System");
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        if (login(username, password)) {
            System.out.println("Login successful!\n");

            System.out.print("Enter Patient Name to Search: ");
            String name = scanner.nextLine();

            Patient patient = searchPatient(name);
            if (patient != null) {
                System.out.println("Patient Found: " + patient.getName());
                System.out.println("Eligibility: " + patient.checkEligibility());
            } else {
                System.out.println("Patient not found.");
            }

            // Loop to display all patient data
            for (Patient p : patients) {
                System.out.println("Name: " + p.getName() + ", Age: " + p.getAge() + ", Gender: " + p.getGender());
                System.out.println("Eligibility: " + p.checkEligibility());
                System.out.println();
            }

        } else {
            System.out.println("Invalid credentials. Exiting...");
        }
    }
}

