package registrationandlogin;

import org.junit.Test;
import static org.junit.Assert.*;

public class RegistrationAndLoginTest {

    @Test
    public void testCheckUsernameValid() {
        RegistrationAndLogin reg = new RegistrationAndLogin("user_", "Password1!", "First", "Last");
        assertTrue(reg.checkUsername("user_"));
    }

    @Test
    public void testCheckUsernameInvalid() {
        RegistrationAndLogin reg = new RegistrationAndLogin("user", "Password1!", "First", "Last");
        assertFalse(reg.checkUsername("user"));
    }

    @Test
    public void testCheckPasswordComplexityValid() {
        RegistrationAndLogin reg = new RegistrationAndLogin("user_", "Password1!", "First", "Last");
        assertTrue(reg.checkPasswordComplexity("Password1!"));
    }

    @Test
    public void testCheckPasswordComplexityInvalid() {
        RegistrationAndLogin reg = new RegistrationAndLogin("user_", "pass", "First", "Last");
        assertFalse(reg.checkPasswordComplexity("pass"));
    }

    @Test
    public void testLoginUserValid() {
        RegistrationAndLogin reg = new RegistrationAndLogin("user_", "Password1!", "First", "Last");
        assertTrue(reg.loginUser("user_", "Password1!"));
    }

    @Test
    public void testLoginUserInvalid() {
        RegistrationAndLogin reg = new RegistrationAndLogin("user_", "Password1!", "First", "Last");
        assertFalse(reg.loginUser("user_", "wrongpassword"));
    }
}
