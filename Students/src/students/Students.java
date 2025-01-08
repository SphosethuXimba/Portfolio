package students;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import static students.StudentsMainClass.loopSystem;

public class Students
{
    // Private member variables to store student details
    private String studentId;
    private String studentName;
    private int studentAge;
    private String studentEmail;
    private String studentCourse;

    // Constructor to initialize a new student object
    public Students(String studentId, String studentName, int studentAge, String studentEmail, String studentCourse)
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentEmail = studentEmail;
        this.studentCourse = studentCourse;
    }

    // Getters and Setters for the student details
    public String getStudentId() 
    {
        return studentId;
    }

    public String getStudentName() 
    {
        return studentName;
    }

    public int getStudentAge() 
    {
        return studentAge;
    }

    public String getStudentEmail() 
    {
        return studentEmail;
    }

    public String getStudentCourse() 
    {
        return studentCourse;
    }

    public void setStudentId(String studentId) 
    {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) 
    {
        this.studentName = studentName;
    }

    public void setStudentAge(int studentAge) 
    {
        this.studentAge = studentAge;
    }

    public void setStudentEmail(String studentEmail) 
    {
        this.studentEmail = studentEmail;
    }

    public void setStudentCourse(String studentCourse) 
    {
        this.studentCourse = studentCourse;
    }

    // List to store student objects
    private ArrayList<Students> studentList;
    private Scanner scanner;

    // Constructor for the Students class to initialize the list and scanner
    public Students()
    {
        studentList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // Method to capture and save a new student
    public void saveStudent() 
    {
        scanner.nextLine(); // Consume the newline left by nextInt()
        System.out.println("CAPTURE A NEW STUDENT");
        System.out.println("******************************");
        System.out.print("Enter the Student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter the Student Name: ");
        String studentName = scanner.nextLine();

        int studentAge = 0;
        boolean validInput = false;

        while (!validInput) 
        {
            System.out.print("Enter the Student Age: ");
            try 
            {
                studentAge = scanner.nextInt();
                if (studentAge < 16) {
                    System.out.println("You have entered an incorrect student age!!!");
                    System.out.println("Please re-enter student age >> ");
                }
                else 
                {
                    validInput = true;
                }
            } 
            catch (InputMismatchException e) 
            {
                System.out.println("You have entered an incorrect student age!!!");
                System.out.println("Please re-enter student age >> ");
                scanner.next(); // Clear the invalid input
            }
        }

        scanner.nextLine(); // Consume the newline left by nextInt()

        System.out.print("Enter the Student Email: ");
        String studentEmail = scanner.nextLine();

        System.out.print("Enter the Student Course: ");
        String studentCourse = scanner.nextLine();

        // Create a new Students object and add it to the list
        Students newStudent = new Students(studentId, studentName, studentAge, studentEmail, studentCourse);
        studentList.add(newStudent);

        System.out.println("Student added successfully!");
        loopSystem();
    }

    // Overloaded method to save a student by directly passing the details
    public void saveStudent(String studentId, String studentName, int studentAge, String studentEmail, String studentCourse) 
    {
        Students newStudent = new Students(studentId, studentName, studentAge, studentEmail, studentCourse);
        studentList.add(newStudent);
        System.out.println("Student added successfully!");
    }

    // Method to search for a student by ID
    public Students searchStudent(String studentId) 
    {
        for (Students student : studentList)
        {
            if (student.getStudentId().equalsIgnoreCase(studentId)) 
            {
                return student;
            }
        }
        return null; // Return null if student not found
    }

    // Method to delete a student by ID
    public void deleteStudent()
    {
        scanner.nextLine(); // Consume the newline left by nextInt()
        System.out.print("Enter Student ID to delete: ");
        String studentId = scanner.nextLine();
        boolean found = false;

        for (Students student : studentList) 
        {
            if (student.getStudentId().equalsIgnoreCase(studentId)) 
            {
                System.out.print("Are you sure you want to delete this student " + studentId + " from the system? Yes (y) to delete: ");
                String authorization = scanner.nextLine();
                System.out.println("----------------------------------------");
                if (authorization.equalsIgnoreCase("y")) 
                {
                    studentList.remove(student);
                    System.out.println("Student with Student ID: " + studentId + " was deleted!");
                }
                else 
                {
                    System.out.println("Cancelled deletion.");
                }
                found = true;
                break;
            }
        }

        if (!found)
        {
            System.out.println("Student not found.");
        }
    }

    // Method to print a report of all students
   public void studentReport() 
{
    if (studentList.isEmpty()) 
    {
        System.out.println("No students available.");
    } 
    else 
    {
        int index = 1;
        for (Students student : studentList) 
        {
            System.out.println("STUDENT " + index);
            System.out.println("----------------------------------------");
            System.out.println("Student ID: " + student.getStudentId());
            System.out.println("Student Name: " + student.getStudentName());
            System.out.println("Student Age: " + student.getStudentAge());
            System.out.println("Student Email: " + student.getStudentEmail());
            System.out.println("Student Course: " + student.getStudentCourse());
            System.out.println("----------------------------------------");
            index++;
        }
    }
}


    // Method to exit the student application
    public void exitStudentApplication() 
    {
        System.out.println("Exiting application. Goodbye!");
         System.exit(0); // Exit the application
    }

    // Getter for the student list
    public ArrayList<Students> getStudentList() 
    {
        return studentList;
    }

    // Method to display the menu and handle user input
    public void displayMenu() 
    {
        while (true)
        {
            System.out.println("Please select one of the following menu items:");
            System.out.println("(1) Capture new student.");
            System.out.println("(2) Search for a student.");
            System.out.println("(3) Delete a student.");
            System.out.println("(4) Print student report.");
            System.out.println("(5) Exit application.");

            int choice;
            try 
            {
                choice = scanner.nextInt();
            } 
            catch (InputMismatchException e) 
            {
                System.out.println("Invalid input. Exiting application.");
                scanner.next(); // Clear the invalid input
                break;
            }

            switch (choice) 
            {
                case 1:
                    saveStudent();
                    break;
                case 2:
                    scanner.nextLine(); // Consume the newline left by nextInt()
                    System.out.print("Enter Student ID to search: ");
                    String searchId = scanner.nextLine();
                    System.out.println("\n----------------------------------------");
                    Students foundStudent = searchStudent(searchId);

                if (foundStudent != null) 
                {
                    System.out.println("Student ID: " + foundStudent.getStudentId());
                    System.out.println("Student Name: " + foundStudent.getStudentName());
                    System.out.println("Student Age: " + foundStudent.getStudentAge());
                    System.out.println("Student Email: " + foundStudent.getStudentEmail());
                    System.out.println("Student Course: " + foundStudent.getStudentCourse());
                    System.out.println("\n----------------------------------------");
                    loopSystem();
                } 
                else 
                {
                    System.out.println("Student with Student ID: " + searchId + " not found.");
                    System.out.println("\n----------------------------------------");
                    loopSystem();
                }
                break;
                case 3:
                    deleteStudent();
                    loopSystem();
                    break;
                case 4:
                    studentReport();
                    loopSystem();
                    break;
                case 5:
                    exitStudentApplication();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

    // Override toString() method to provide a string representation of a student object
    @Override
    public String toString()
    {
        return "Student ID: " + studentId + ", Student Name: " + studentName + ", Student Age: " + studentAge + ", Student Email: " + studentEmail + ", Student Course: " + studentCourse;
    }
}

/*
 * Title: Java Programming
 * Author: Joyce, J.
 * Date: 2018
 * Edition: 9th
 * Publisher: Cengage
 */
