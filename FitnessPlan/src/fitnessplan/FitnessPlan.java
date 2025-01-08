package fitnessplan;

/**
 * Provides methods to generate and display fitness plans based on user goals such as weight loss, muscle gain, or weight gain.
 * This class allows users to create a tailored plan that includes dietary recommendations and exercise routines.
 */

public class FitnessPlan 
{
    private String[] dietPlan;        // Array to store the diet plan
    private String[] exercisePlan;    // Array to store the exercise plan
    private int workoutDays;          // Number of workout days per week

    /**
     * Constructor that initializes the arrays for diet and exercise plans.
     */
    public FitnessPlan() 
    {
        this.dietPlan = new String[5];
        this.exercisePlan = new String[5];
    }

    /**
     * Generates a fitness plan based on the user's goal.
     * The user's fitness goal (1 for weight loss, 2 for muscle gain, 3 for weight gain).
     */
    public void generatePlan(int goal) 
    {
        switch (goal) 
        {
            case 1:
                generateWeightLossPlan(); // Generate a plan for weight loss
                break;
            case 2:
                generateMuscleGainPlan(); // Generate a plan for muscle gain
                break;
            case 3:
                generateWeightGainPlan(); // Generate a plan for weight gain
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }
    }

    /**
     * Generates a plan for weight loss by setting the diet and exercise plans accordingly.
     */
    private void generateWeightLossPlan() 
    {
        dietPlan[0] = "Consume 500-750 calories less than maintenance.";
        dietPlan[1] = "Protein: 25-30% (Lean meats, fish, tofu).";
        dietPlan[2] = "Carbs: 40-50% (Whole grains, vegetables).";
        dietPlan[3] = "Fats: 20-25% (Avocados, nuts, olive oil).";
        dietPlan[4] = "3 main meals with 1-2 snacks.";

        exercisePlan[0] = "Cardio: 4-5 times a week (30-45 mins).";
        exercisePlan[1] = "Strength Training: 2-3 times a week.";
        exercisePlan[2] = "Focus on compound exercises.";
        exercisePlan[3] = "Include HIIT.";
        exercisePlan[4] = "Yoga/Stretching: 1-2 times a week.";

        workoutDays = 5; // Set the number of workout days per week
    }

    /**
     * Generates a plan for muscle gain by setting the diet and exercise plans accordingly.
     */
    private void generateMuscleGainPlan() 
    {
        dietPlan[0] = "Consume 250-500 calories more than maintenance.";
        dietPlan[1] = "Protein: 30-35% (Chicken, eggs, protein shakes).";
        dietPlan[2] = "Carbs: 40-50% (Whole grains, potatoes).";
        dietPlan[3] = "Fats: 20-25% (Nuts, seeds, fatty fish).";
        dietPlan[4] = "4-6 meals per day.";

        exercisePlan[0] = "Strength Training: 4-5 times a week.";
        exercisePlan[1] = "Focus on heavy lifting.";
        exercisePlan[2] = "Include hypertrophy techniques.";
        exercisePlan[3] = "Cardio: 1-2 times a week (low-intensity).";
        exercisePlan[4] = "Yoga/Stretching: 1-2 times a week.";

        workoutDays = 5; // Set the number of workout days per week
    }

    /**
     * Generates a plan for weight gain by setting the diet and exercise plans accordingly.
     */
    private void generateWeightGainPlan() 
    {
        dietPlan[0] = "Consume 500-700 calories more than maintenance.";
        dietPlan[1] = "Protein: 20-25% (Lean meats, dairy, legumes).";
        dietPlan[2] = "Carbs: 50-60% (Whole grains, starchy vegetables).";
        dietPlan[3] = "Fats: 25-30% (Avocados, nuts, cheese).";
        dietPlan[4] = "4-6 meals per day with high-calorie snacks.";

        exercisePlan[0] = "Strength Training: 3-4 times a week.";
        exercisePlan[1] = "Focus on compound exercises.";
        exercisePlan[2] = "Lower reps (6-8 per set).";
        exercisePlan[3] = "Minimal to no cardio.";
        exercisePlan[4] = "Yoga/Stretching: 1-2 times a week.";

        workoutDays = 4; // Set the number of workout days per week
    }

    /**
     * Displays the generated fitness plan, including diet and exercise recommendations,
     * and the number of workout days per week.
     */
    public void displayPlan() 
    {
        System.out.println("Personalized Fitness Plan:");
        System.out.println("--------------------------");
        System.out.println("Diet Plan:");
        for (String diet : dietPlan)
        {
            System.out.println("- " + diet);
        }
        System.out.println();
        System.out.println("Exercise Plan:");
        for (String exercise : exercisePlan)
        {
            System.out.println("- " + exercise);
        }
        System.out.println();
        System.out.println("Workout Days per Week: " + workoutDays);
    }

    /**
     * Getter for the diet plan.
     * @return An array of strings representing the diet plan.
     */
    public String[] getDietPlan() 
    {
        return dietPlan;
    }

    /**
     * Getter for the exercise plan.
     * @return An array of strings representing the exercise plan.
     */
    public String[] getExercisePlan() {
        
        return exercisePlan;
    }

    /**
     * Getter for the number of workout days per week.
     * @return The number of workout days per week.
     */
    public int getWorkoutDays() 
    {
        return workoutDays;
    }
}

/*
 * Title: Java Programming
 * Author: Joyce, J.
 * Date: 2018
 * Edition: 9th
 * Publisher: Cengage
 */