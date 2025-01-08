package fitnessplan;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Unit tests for the FitnessPlan class using JUnit 4.
 */
public class FitnessPlanTest 
{

    private FitnessPlan plan;

    @Before
    public void setUp() 
    {
        plan = new FitnessPlan();
    }

    @Test
    public void testGenerateWeightLossPlan() 
    {
        plan.generatePlan(1);
        assertEquals("Workout days should be 5 for weight loss plan.", 5, plan.getWorkoutDays());
        assertArrayEquals("Diet plan for weight loss is incorrect.", new String[]
        {
            "Consume 500-750 calories less than maintenance.",
            "Protein: 25-30% (Lean meats, fish, tofu).",
            "Carbs: 40-50% (Whole grains, vegetables).",
            "Fats: 20-25% (Avocados, nuts, olive oil).",
            "3 main meals with 1-2 snacks."
        }
                , plan.getDietPlan());
        
        assertArrayEquals("Exercise plan for weight loss is incorrect.", new String[]
        {
            "Cardio: 4-5 times a week (30-45 mins).",
            "Strength Training: 2-3 times a week.",
            "Focus on compound exercises.",
            "Include HIIT.",
            "Yoga/Stretching: 1-2 times a week."
        }
                , plan.getExercisePlan());
    }

    @Test
    public void testGenerateMuscleGainPlan() 
    {
        plan.generatePlan(2);
        assertEquals("Workout days should be 5 for muscle gain plan.", 5, plan.getWorkoutDays());
        assertArrayEquals("Diet plan for muscle gain is incorrect.", new String[]
        {
            "Consume 250-500 calories more than maintenance.",
            "Protein: 30-35% (Chicken, eggs, protein shakes).",
            "Carbs: 40-50% (Whole grains, potatoes).",
            "Fats: 20-25% (Nuts, seeds, fatty fish).",
            "4-6 meals per day."
        }
                , plan.getDietPlan());
        
        assertArrayEquals("Exercise plan for muscle gain is incorrect.", new String[]
        {
            "Strength Training: 4-5 times a week.",
            "Focus on heavy lifting.",
            "Include hypertrophy techniques.",
            "Cardio: 1-2 times a week (low-intensity).",
            "Yoga/Stretching: 1-2 times a week."
        }
                , plan.getExercisePlan());
    }

    @Test
    public void testGenerateWeightGainPlan() 
    {
        plan.generatePlan(3);
        assertEquals("Workout days should be 4 for weight gain plan.", 4, plan.getWorkoutDays());
        assertArrayEquals("Diet plan for weight gain is incorrect.", new String[]
        {
            "Consume 500-700 calories more than maintenance.",
            "Protein: 20-25% (Lean meats, dairy, legumes).",
            "Carbs: 50-60% (Whole grains, starchy vegetables).",
            "Fats: 25-30% (Avocados, nuts, cheese).",
            "4-6 meals per day with high-calorie snacks."
        }
                , plan.getDietPlan());
        
        assertArrayEquals("Exercise plan for weight gain is incorrect.", new String[]
        {
            "Strength Training: 3-4 times a week.",
            "Focus on compound exercises.",
            "Lower reps (6-8 per set).",
            "Minimal to no cardio.",
            "Yoga/Stretching: 1-2 times a week."
        }
                , plan.getExercisePlan());
    }

    @Test
    public void testDisplayPlan()
    {
        // Redirect console output to capture displayPlan output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out; // Save original System.out
        System.setOut(new PrintStream(outputStream));

        // Generate and display a weight loss plan
        plan.generatePlan(1);
        plan.displayPlan();

        // Capture the output
        String output = outputStream.toString();

        // Validate that the correct plan is displayed
        assertTrue("Output should contain correct diet information for weight loss.",
                   output.contains("Consume 500-750 calories less than maintenance."));
        assertTrue("Output should contain correct exercise information for weight loss.",
                   output.contains("Cardio: 4-5 times a week (30-45 mins)."));
        assertTrue("Output should contain correct workout days information for weight loss.",
                   output.contains("Workout Days per Week: 5"));

        // Reset the console output
        System.setOut(originalOut);
    }
}
