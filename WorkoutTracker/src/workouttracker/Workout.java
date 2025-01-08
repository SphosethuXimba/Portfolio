package workouttracker;

// Abstract class Workout representing a general workout routine.
abstract class Workout {
    // Fields to store the exercises, duration (in minutes), and intensity level of the workout.
    private String exercises;
    private int duration;
    private int intensityLevel;

    // Constructor to initialize the fields.
    public Workout(String exercises, int duration, int intensityLevel) {
        this.exercises = exercises;
        this.duration = duration;
        this.intensityLevel = intensityLevel;
    }

    // Getter method to retrieve the exercises.
    public String getExercises() {
        return exercises;
    }

    // Getter method to retrieve the workout duration.
    public int getDuration() {
        return duration;
    }

    // Getter method to retrieve the intensity level of the workout.
    public int getIntensityLevel() {
        return intensityLevel;
    }
}
