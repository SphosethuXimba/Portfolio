package registrationandlogin;

import javax.swing.JOptionPane;

public class AddingTasks 
{
    private String taskName;
    private static int taskNumber = 0; // Static variable to keep track of the task number
    private String taskDescription;
    private String developerDetails;
    private double taskDuration;
    private String taskID;
    private String taskStatus;
    private static int sum = 0; // Static variable to keep the sum of all task durations
    
    // create arrays to hold task values 
    String[] arrDevelopers = {"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer"}; // contains the names of all the developers
    String[] arrTaskNames = {"Create Login", "Create Add Features", "Create Reports", "Add Arrays"}; // contains the names of all the tasks
    int[] arrTaskDurations = {5, 8, 2, 11}; // contains the duration of all tasks
    String[] arrTaskStatus = {"To Do", "Doing", "Done", "To Do"}; // contains the status of all tasks
    String[] arrTaskIds = new String[4]; // contains the generated task ID's for all tasks
    
    // method to populate arrTaskIds array 
    public void populateTaskIdsArray()
    {
        for (int i=0; i < arrTaskIds.length; i++)
        {
            int space = arrDevelopers[i].indexOf(" ");
            String developerID = arrDevelopers[i].substring(space - 3, space).toUpperCase();
            String nameID = arrTaskNames[i].substring(0, 2).toUpperCase();
            arrTaskIds[i] = nameID + ":" + i + ":" + developerID; // Using i instead of taskNumber for unique task numbers
        } 
    }
     
    // Constructor to initialize task details
    public AddingTasks(String taskName, String taskDescription, String developerDetails, double taskDuration, String taskStatus)
    {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDuration;
        this.taskStatus = taskStatus;
        this.taskID = createTaskID();
        sum += taskDuration;
        taskNumber++; // Increment task number for each new task
    }
    
    public AddingTasks()
    {
        populateTaskIdsArray(); // Populate the task IDs upon creating an instance
    }

    public String displayArray()
    {
        String output = ""; // string value to hold the report of all the tasks made
    
        // run a loop for all the tasks made
        for (int i =0; i < arrTaskIds.length; i++)
        {
            // add the display values for the task to the display report 
            output += "Task Name: \t" + arrTaskNames[i];
            output += "\nTask Number: \t" + i;
            output += "\nTask ID: \t" + arrTaskIds[i];
            output += "\nDeveloper Details: \t" + arrDevelopers[i];
            output += "\nTask Duration: \t" + arrTaskDurations[i]  + " hours";
            output += "\nTask Status: \t" + arrTaskStatus[i] + "\n\n";
        }
        // output the report with all transactions
        JOptionPane.showMessageDialog(null, output);
        return output;
    }

    public String displayDoneTasks()
    {
        String output = "";
        for (int i = 0; i < arrTaskIds.length; i++)
        {
            if (arrTaskStatus[i].equalsIgnoreCase("Done")){
                output += "Task Name: \t" + arrTaskNames[i];
                output += "\nTask Number: \t" + i;
                output += "\nTask ID: \t" + arrTaskIds[i];
                output += "\nDeveloper Details: \t" + arrDevelopers[i];
                output += "\nTask Duration: \t" + arrTaskDurations[i]  + " hours";
                output += "\nTask Status: \t" + arrTaskStatus[i] + "\n\n";
            }
        }
        JOptionPane.showMessageDialog(null, output); 
        return output;
    }

    public boolean searchTasks(String searchValue) {
    
    
    // Loop through all tasks to search for the task name entered by the user
    boolean found = false; // Flag to indicate if task was found
    for (int i = 0; i < arrTaskIds.length; i++) {
        // Compare task name ignoring case
        if (arrTaskNames[i].equalsIgnoreCase(searchValue)) {
            // Task found, display its details
            String output = "Task Name: \t" + arrTaskNames[i];
            output += "\nTask Number: \t" + i;
            output += "\nTask ID: \t" + arrTaskIds[i];
            output += "\nDeveloper Details: \t" + arrDevelopers[i];
            output += "\nTask Duration: \t" + arrTaskDurations[i] + " hours";
            output += "\nTask Status: \t" + arrTaskStatus[i];

            // Display output
            JOptionPane.showMessageDialog(null, output);
            found = true; // Task was found
            break; // Exit loop once task is found
        }
    }

    // If task was not found, notify user
    if (!found) {
        JOptionPane.showMessageDialog(null, "Task not found. Please try again");
    }

    return found; // Return whether task was found or not
}


    // A method to search for the task with the longest duration and display the developer details of that task
    public void longestDuration()
    {
        int longest = arrTaskDurations[0];
        int longestIndex = 0;

        for (int i = 1; i < arrTaskIds.length; i++)
        {
            if (arrTaskDurations[i] > longest)
            {
                longest = arrTaskDurations[i];
                longestIndex = i;
            }
        }

        JOptionPane.showMessageDialog(null, "The developer with the longest task duration is " + arrDevelopers[longestIndex] + " and the duration is " + arrTaskDurations[longestIndex] + " hours.");
    }

   public boolean removeTasks(String removeValue) {
    int count = 0;
    for (String name : arrTaskNames) {
        if (!name.equalsIgnoreCase(removeValue)) {
            count++;
        }
    }

    if (count == arrTaskNames.length) {
        JOptionPane.showMessageDialog(null, "Task could not be removed. Please try again");
        return false;
    }

    String[] tempArrDevelopers = new String[count];
    String[] tempArrTaskNames = new String[count];
    String[] tempArrTaskIds = new String[count];
    int[] tempArrTaskDurations = new int[count];
    String[] tempArrTaskStatus = new String[count];

    int j = 0;

    for (int i = 0; i < arrTaskIds.length; i++) {
        if (!arrTaskNames[i].equalsIgnoreCase(removeValue)) {
            tempArrTaskDurations[j] = arrTaskDurations[i];
            tempArrTaskIds[j] = arrTaskIds[i];
            tempArrTaskNames[j] = arrTaskNames[i];
            tempArrTaskStatus[j] = arrTaskStatus[i];
            tempArrDevelopers[j] = arrDevelopers[i];
            j++;
        }
    }

    arrTaskDurations = tempArrTaskDurations;
    arrDevelopers = tempArrDevelopers;
    arrTaskIds = tempArrTaskIds;
    arrTaskNames = tempArrTaskNames;
    arrTaskStatus = tempArrTaskStatus;

    JOptionPane.showMessageDialog(null, "Task removed successfully.");
    return true;
}



    // Method to check if the task description is valid
    public boolean checkTaskDescription(String taskDescription) 
    {
        if (taskDescription.length() <= 50) {
            JOptionPane.showMessageDialog(null, "Task successfully captured");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
            return false;
        }
    }

    // Method to create a unique task ID
    public String createTaskID() 
    {
        String output = "";
        if (developerDetails.contains(" ") && taskName.length() >= 2) {
            int space = developerDetails.indexOf(" ");
            String devID = developerDetails.substring(space - 3, space).toUpperCase();
            String nameID = taskName.substring(0, 2).toUpperCase();
            output = nameID + ":" + taskNumber + ":" + devID;
        } else {
            output = "Invalid Developer Details";
        }
        return output;
    }
// Method to print task details
    public String printTaskDetails() 
    {
        StringBuilder display = new StringBuilder();
        display.append("\nStatus: ").append(taskStatus);
        display.append("\nDeveloper Details: ").append(developerDetails);
        display.append("\nTask Number: ").append(taskNumber);
        display.append("\nTask Name: ").append(taskName);
        display.append("\nTask Description: ").append(taskDescription);
        display.append("\nTask ID: ").append(taskID);
        display.append("\nTask Duration: ").append(taskDuration);display.append(" hours");

        return display.toString();
    }

    // Static method to create multiple tasks
    public static int createTasks(int numTasks)
    {
        int total = 0;
        taskNumber = 0; // Ensure taskNumber starts at 0 for the first task

        for (int i = 0; i < numTasks; i++) {
            String taskName = JOptionPane.showInputDialog(null, "Please enter the name of task " + (i + 1));
            String taskDescription = JOptionPane.showInputDialog(null, "Please enter the describtion of task " + (i + 1));
            String developerDetails = JOptionPane.showInputDialog(null, "Please enter the details of the task developer of task " + (i + 1));
            String duration = JOptionPane.showInputDialog(null, "Please enter the duration of task " + (i + 1));
            int taskDuration = Integer.parseInt(duration);
            String taskStatus = JOptionPane.showInputDialog(null, "Please select the status of task " + (i + 1) + "\n1:TO DO\n2:DONE\n3:DOING");
            int option = Integer.parseInt(taskStatus);
            String status = retrieveStatus(option);

            AddingTasks task = new AddingTasks(taskName, taskDescription, developerDetails, taskDuration, status);
            JOptionPane.showMessageDialog(null, task.printTaskDetails());
            total = sum;
        }
        return total;
    }

    // Static method to retrieve task status based on user selection
    public static String retrieveStatus(int option) 
    {
        switch (option) {
            case 1:
                return "TO DO";
            case 2:
                return "DONE";
            case 3:
                return "DOING";
            default:
                return "UNKNOWN";
        }
    }

    
    // Getter for the sum of all task durations
    public static int getSum() {
        return sum;
    }
}

/*
 * Title: Java Programming
 * Author: Joyce, J.
 * Date: 2018
 * Edition: 9th
 * Publisher: Cengage
 */
