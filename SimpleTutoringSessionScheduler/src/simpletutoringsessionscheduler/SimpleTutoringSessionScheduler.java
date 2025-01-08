package simpletutoringsessionscheduler;
import javax.swing.*;
import java.io.*;

public class SimpleTutoringSessionScheduler {

    public static void main(String[] args) {
        String studentName = JOptionPane.showInputDialog("Enter Student Name:");
        if (studentName == null || studentName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Student name cannot be empty.");
            return;
        }

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String sessionDay = (String) JOptionPane.showInputDialog(null, "Select Session Day:",
                "Day Selection", JOptionPane.QUESTION_MESSAGE, null, daysOfWeek, daysOfWeek[0]);

        String[] sessionTimes = {"3:00 PM", "4:00 PM", "5:00 PM", "6:00 PM", "7:00 PM", "8:00 PM"};
        String sessionTime = (String) JOptionPane.showInputDialog(null, "Select Session Time:",
                "Time Selection", JOptionPane.QUESTION_MESSAGE, null, sessionTimes, sessionTimes[0]);

        if (sessionDay != null && sessionTime != null) {
            String sessionDetails = studentName + " - " + sessionDay + " at " + sessionTime;
            saveSession(sessionDetails);
            loadSessions();
        }
    }

    private static void saveSession(String sessionDetails) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("tutoring_sessions.txt", true))) {
            writer.write(sessionDetails);
            writer.newLine();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving session: " + e.getMessage());
        }
    }

    private static void loadSessions() {
        StringBuilder sessions = new StringBuilder("Scheduled Sessions:\n");
        File file = new File("tutoring_sessions.txt");
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    sessions.append(line).append("\n");
                }
                JOptionPane.showMessageDialog(null, sessions.toString());
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error loading sessions: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No sessions found.");
        }
    }
}
