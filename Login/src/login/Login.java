
package login;

/**
 *
 * @author lab_services_student
 */
import java.util.Scanner;
public class Login 
{
    private String username;
    private String password;
    
    public Login (String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public boolean checkuserName()
    {
        if(username.length()<=10 && username.contains("$"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    /*
    Title: Java regex validate password examples
    Author: Mkyong
    Date: 5 November 2020
    Code Version: 1 
    Availability: https://mkyong.com/regular-expressions/how-to-validate-password-with-regular-expression/
    */
    
    public boolean checkpasswordComplexity()
            {
 String regex ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
return password.matches(regex);
            }
    
    public String registerUser()
    {
      if(!checkuserName())  
      {
          return "Username Format not correct";
      }
      else if (!checkpasswordComplexity())
      {
          return "Password format not correct";
      }
      else
          return "Username and password succesfully captured";
    }
    
    public boolean loginUser (String enteredUsername, String enteredPassword)
    {
        if (enteredUsername==username && enteredPassword==password)
        {
      return true;
        }
        else
        {
            return false;
        }  
    }
    
    public String returnLoginStatus (boolean loginStatus)
    {
        if (loginStatus)
        {
            return "Welcome Sphosethu";
        }
        else
        {
            return "Invalid credentials";
        }
    }
            
            
    public static void main(String[] args)
    {
     Scanner scanner = new Scanner (System.in);
     
     System.out.println("Please enter your username:");
     String username=scanner.nextLine();
     
     System.out.println("Please enter your password:");
     String password=scanner.nextLine();
     
     Login user = new Login (username,password);
     System.out.println(user.registerUser());
     
     System.out.println("Please enter your username to login:");
     String enteredusername=scanner.nextLine();
     
     System.out.println("Please enter your password to login:");
     String enteredpassword=scanner.nextLine();
     
    boolean loginStatus= user.loginUser(enteredusername, enteredpassword);
       System.out.println(user.returnLoginStatus((loginStatus)));
    scanner.close();
     
    }
    
}
