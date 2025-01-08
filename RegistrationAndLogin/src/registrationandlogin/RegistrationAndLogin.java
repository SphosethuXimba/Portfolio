package registrationandlogin;

import javax.swing.JOptionPane;

public class RegistrationAndLogin
{
    private String username;
    private String password;
    private String firstname;
    private String lastname;

    // Constructor to initialize user details
    public RegistrationAndLogin(String username, String password, String firstname, String lastname) {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // Method to register a new user
    public String registerUser() 
    {
        while (true) {
            if (!checkUsername(username)) {
                JOptionPane.showMessageDialog(null, "Username is not correctly formatted. Please ensure that your username contains an underscore and is no longer than 5 characters in length.");
                username = JOptionPane.showInputDialog(null, "Please enter your username:");
            } else if (!checkPasswordComplexity(password)) {
                JOptionPane.showMessageDialog(null, "Password is not correctly formatted. Please ensure that your password contains at least 8 characters, a capital letter, a number, and a special character.");
                password = JOptionPane.showInputDialog(null, "Please enter your password:");
            } else {
                JOptionPane.showMessageDialog(null, "Username and password successfully captured.");
                break;
            }
        }
        return null;
    }

    // Method to validate login credentials
    public boolean loginUser(String enteredUsername, String enteredPassword) 
    {
        return enteredUsername.equals(username) && enteredPassword.equals(password);
    }

    // Method to handle user login attempts
    public String returnLoginStatus() 
    {
        boolean loginStatus = false;
        while (!loginStatus) {
            String enteredUsername = JOptionPane.showInputDialog(null, "Please enter your username to login:");
            String enteredPassword = JOptionPane.showInputDialog(null, "Please enter your password to login:");
            loginStatus = loginUser(enteredUsername, enteredPassword);
            if (!loginStatus) {
                JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again.");
            } else {
                JOptionPane.showMessageDialog(null, "Welcome " + firstname + " " + lastname + ", it is great to see you again.");
                JOptionPane.showMessageDialog(null, "Welcome to EasyKanBan");
            }
        }
        return null;
    }

    // Method to check if the username is valid
    public boolean checkUsername(String username) 
    {
        return username.contains("_") && username.length() <= 5;
    }
 /*
    Title: Java regex validate password examples
    Author: Mkyong
    Date: 5 November 2020
    Code Version: 1 
    Availability: https://mkyong.com/regular-expressions/how-to-validate-password-with-regular-expression/
    */
    // Method to check if the password is valid
    public boolean checkPasswordComplexity(String password)
    {
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()*–[{}]:;',?/*~$^+=<>]).{8,}$";
        return password.matches(regex);
    }
}
/*
 * Title: Java Programming
 * Author: Joyce, J.
 * Date: 2018
 * Edition: 9th
 * Publisher: Cengage
 */