package registrationandlogin;
import javax.swing.JOptionPane;
import static registrationandlogin.AddingTasks.createTasks;

public class AddingTasksMC 
{

    public static void main(String[] args) 
    {
        // Get user details for registration
        String firstname = JOptionPane.showInputDialog(null, "Please enter your first name:");
        String lastname = JOptionPane.showInputDialog(null, "Please enter your last name:");
        String username = JOptionPane.showInputDialog(null, "Please enter your username:");
        String password = JOptionPane.showInputDialog(null, "Please enter your password:");

        // Create a new RegistrationAndLogin object and register the user
        RegistrationAndLogin user = new RegistrationAndLogin(username, password, firstname, lastname);
        user.registerUser();

        // Prompt the user to log in
        user.returnLoginStatus();

        // Display options for task management
        options();
    }

    public static void report()
    {
        String choice = JOptionPane.showInputDialog("Please select an option:\n1.Display all tasks\n2.Show all tasks which are done\n3.Search for a task\n4.Remove a task\n5. Display the task with the longest duration");
        int option = Integer.parseInt(choice);
        
        AddingTasks reportAddingTask = new AddingTasks();
        
        switch (option) 
        {
            case 1:
                reportAddingTask.displayArray();
                break;
                case 2:
                reportAddingTask.displayDoneTasks();
                break;
                case 3:
                String searchValue = JOptionPane.showInputDialog("Enter task name to search for");
                reportAddingTask.searchTasks(searchValue);
                break;
                case 4:
                String removeValue = JOptionPane.showInputDialog("Enter task name to delete");
                reportAddingTask.removeTasks(removeValue);
                break;
                case 5:
                reportAddingTask.longestDuration();
                break;
            default:
                throw new AssertionError();
        }
    }
    
    // Method to display options for the user
    public static void options() 
    {
        int option = 0;

        while (option != 3) 
        {
            String tasks = JOptionPane.showInputDialog(null, "Please select one of the following options:(enter the number of your selection)\n"
                    + "1: Add tasks\n2: Show report\n3: Exit");
            option = Integer.parseInt(tasks);

            switch (option)
            {
                case 1:
                    // Add tasks
                    String task = JOptionPane.showInputDialog(null, "Please enter the number of tasks you want to create");
                    int numTasks = Integer.parseInt(task);
                    int sum = createTasks(numTasks);
                    JOptionPane.showMessageDialog(null, "Total duration of tasks: " + sum + " hours");
                    break;

                case 2:
                    // Show report
                    report();
                    break;

                case 3:
                    // Exit the application
                    JOptionPane.showMessageDialog(null, "Goodbye");
                    System.exit(0);
                    break;
            }
        }
    }
}
/*
 * Title: Java Programming
 * Author: Joyce, J.
 * Date: 2018
 * Edition: 9th
 * Publisher: Cengage
 */