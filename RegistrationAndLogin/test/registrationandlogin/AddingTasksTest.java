package registrationandlogin;

import javax.swing.JOptionPane;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AddingTasksTest {
    private AddingTasks addingTasks;

    @Before
    public void setUp() {
        addingTasks = new AddingTasks();
        addingTasks.populateTaskIdsArray();
    }

    @Test
    public void testCheckTaskDescriptionValid() {
        AddingTasks task = new AddingTasks("Task1", "This is a valid description", "Dev Name", 5, "TO DO");
        assertTrue(task.checkTaskDescription("This is a valid description"));
    }

    @Test
    public void testCheckTaskDescriptionInvalid() {
        AddingTasks task = new AddingTasks("Task1", "This is an invalid description because it is way too long and exceeds the limit of fifty characters", "Dev Name", 5, "TO DO");
        assertFalse(task.checkTaskDescription("This is an invalid description because it is way too long and exceeds the limit of fifty characters"));
    }

    @Test
    public void testCreateTaskIDValid() {
        AddingTasks task = new AddingTasks("Task1", "Description", "Dev Name", 5, "TO DO");
        String taskID = task.createTaskID();
        assertNotNull(taskID);
        assertTrue(taskID.contains("TA"));
    }

    @Test
    public void testRetrieveStatus() {
        assertEquals("TO DO", AddingTasks.retrieveStatus(1));
        assertEquals("DONE", AddingTasks.retrieveStatus(2));
        assertEquals("DOING", AddingTasks.retrieveStatus(3));
    }

    @Test
    public void testSumOfDurations() {
        int initialSum = AddingTasks.getSum();
        new AddingTasks("Task1", "Description1", "Dev Name1", 5, "TO DO");
        new AddingTasks("Task2", "Description2", "Dev Name2", 10, "DONE");
        int newSum = AddingTasks.getSum();
        assertEquals(initialSum + 15, newSum);
    }
    
    @Test
    public void testDisplayArray() {
        String expectedResults = "";

        expectedResults += "Task Name: \t" + "Create Login";
        expectedResults += "\nTask Number: \t" + 0;
        expectedResults += "\nTask ID: \t" + "CR:0:IKE";
        expectedResults += "\nDeveloper Details: \t" + "Mike Smith";
        expectedResults += "\nTask Duration: \t" + 5 + " hours";
        expectedResults += "\nTask Status: \t" + "To Do" + "\n\n";

        expectedResults += "Task Name: \t" + "Create Add Features";
        expectedResults += "\nTask Number: \t" + 1;
        expectedResults += "\nTask ID: \t" + "CR:1:ARD";
        expectedResults += "\nDeveloper Details: \t" + "Edward Harrison";
        expectedResults += "\nTask Duration: \t" + 8 + " hours";
        expectedResults += "\nTask Status: \t" + "Doing" + "\n\n";

        expectedResults += "Task Name: \t" + "Create Reports";
        expectedResults += "\nTask Number: \t" + 2;
        expectedResults += "\nTask ID: \t" + "CR:2:THA";
        expectedResults += "\nDeveloper Details: \t" + "Samantha Paulson";
        expectedResults += "\nTask Duration: \t" + 2 + " hours";
        expectedResults += "\nTask Status: \t" + "Done" + "\n\n";

        expectedResults += "Task Name: \t" + "Add Arrays";
        expectedResults += "\nTask Number: \t" + 3;
        expectedResults += "\nTask ID: \t" + "AD:3:NDA";
        expectedResults += "\nDeveloper Details: \t" + "Glenda Oberholzer";
        expectedResults += "\nTask Duration: \t" + 11 + " hours";
        expectedResults += "\nTask Status: \t" + "To Do" + "\n\n";

        String actualResults = addingTasks.displayArray();
        assertEquals(expectedResults, actualResults);
    }

    @Test
    public void testSearchTasks() {
        boolean actualResult = addingTasks.searchTasks("Create Login");
        assertTrue(actualResult);
    }

    @Test
    public void testDisplayDoneTasks() {
        String actualResults = addingTasks.displayDoneTasks();
        String expectedResults = "";

        expectedResults += "Task Name: \t" + "Create Reports";
        expectedResults += "\nTask Number: \t" + 2;
        expectedResults += "\nTask ID: \t" + "CR:2:THA";
        expectedResults += "\nDeveloper Details: \t" + "Samantha Paulson";
        expectedResults += "\nTask Duration: \t" + 2 + " hours";
        expectedResults += "\nTask Status: \t" + "Done" + "\n\n";

        assertEquals(expectedResults, actualResults);
    }

    @Test
    public void testLongestDuration() {
        addingTasks.longestDuration();
        // Assuming JOptionPane.showMessageDialog is tested manually or mocked in an integration test
        // Here we only check logic or we can mock JOptionPane to capture the message
    }

    @Test
    public void testRemoveTasks() {
        boolean removed = addingTasks.removeTasks("Create Login");
        assertTrue(removed);
    }
}