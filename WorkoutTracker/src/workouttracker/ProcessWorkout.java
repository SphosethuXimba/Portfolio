package workouttracker;

// Class that processes the workout details, extends Workout, and implements the IWorkout interface.
public class ProcessWorkout extends Workout implements IWorkout {

    // Constructor to initialize fields by calling the parent class constructor.
    public ProcessWorkout(String exercises, int duration, int intensityLevel) {
        super(exercises, duration, intensityLevel);
    }

    // Implementation of the printWorkout method that displays the workout details.
    @Override
    public void printWorkout() {
        System.out.println("Workout Details:");
        System.out.println("Exercises: " + getExercises());
        System.out.println("Duration: " + getDuration() + " minutes");
        System.out.println("Intensity Level: " + getIntensityLevel() + " out of 10");
    }
}
