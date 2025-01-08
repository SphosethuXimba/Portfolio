package speedingfineapplication;

public class SpeedingFines extends Fine {
    public SpeedingFines(String personName, int personSpeed) {
        // Call the superclass constructor and calculate the fine based on personSpeed
        super(personName, personSpeed, calculateFine(personSpeed));
    }

    private static double calculateFine(int personSpeed) {
        // Define a base fine calculation, can be adjusted as needed
        if (personSpeed >= 120) {
            return 10.20;
        }
        return 0.0;
    }

    // Implementing the PrintFine method
    @Override
    public void PrintFine() {
        double fee = fine * personSpeed; // Calculate total fine
        System.out.println("**************************************************************");
        System.out.println("PERSON: " + personName);
        System.out.println("SPEED: " + personSpeed + "km");
        System.out.println("FINE PAYABLE: R " + fee);
        System.out.println("**************************************************************");
    }
}
