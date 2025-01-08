package students;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentsTest
{

    private Students manager;

    @Before
    public void setUp()
    {
        // Initialize the Students manager before each test
        manager = new Students();
    }

    @Test
    public void TestSaveStudent()
    {
        // Arrange
        manager.saveStudent("S001", "James Smith", 21, "jamessmith@gmail.com", "Computer Science");

        // Act
        Students savedStudent = manager.searchStudent("S001");

        // Assert
        assertNotNull(savedStudent);
        assertEquals("S001", savedStudent.getStudentId());
        assertEquals("James Smith", savedStudent.getStudentName());
        assertEquals(21, savedStudent.getStudentAge());
        assertEquals("jamessmith@gmail.com", savedStudent.getStudentEmail());
        assertEquals("Computer Science", savedStudent.getStudentCourse());
    }

    @Test
    public void TestSearchStudent() 
    {
        // Arrange
        manager.saveStudent("S5002", "Alexandra Williamson", 22, "alexandrawilliamson@gmail.com", "Medicine");

        // Act
        Students foundStudent = manager.searchStudent("S5002");

        // Assert
        assertNotNull(foundStudent);
        assertEquals("S5002", foundStudent.getStudentId());
        assertEquals("Alexandra Williamson", foundStudent.getStudentName());
        assertEquals(22, foundStudent.getStudentAge());
        assertEquals("alexandrawilliamson@gmail.com", foundStudent.getStudentEmail());
        assertEquals("Medicine", foundStudent.getStudentCourse());
    }

    @Test
    public void TestSearchStudent_StudentNotFound() 
    {
        // Act
        Students foundStudent = manager.searchStudent("S999");

        // Assert
        assertNull(foundStudent);
    }

    @Test
    public void TestStudent_StudentAgeValidation() 
    {
        try 
        {
            // Act
            manager.saveStudent("S005", "Brenna Green", 15, "brennagreen@gmail.com", "Biology");
            
        } 
        catch (IllegalArgumentException e) 
        {
            // Assert
            assertEquals("Student age must be 16 or older.", e.getMessage());
        }
    }

    @Test
    public void TestStudent_StudentAgeInvalidCharacter() 
    {
        try 
        {
            // Act
            manager.saveStudent("S006", "Maurin White", Integer.parseInt("abc"), "maurinwhite@gmail.com", "Civil Engineering");
            fail("Expected NumberFormatException");
        } 
        catch (NumberFormatException e) 
        {
            // Assert
            assertTrue(e.getMessage().contains("For input string"));
        }
    }

@Test
    public void TestDeleteStudent() 
    {
        // Arrange
        manager.saveStudent("S003", "Arthur Andrews", 19, "arthurandrews@gmail.com", "Political Sciences");

        // Act
        manager.deleteStudent();

        // Assert
        Students deletedStudent = manager.searchStudent("S003");
        assertNull(deletedStudent);
    }

   @Test
public void TestDeleteStudent_StudentNotFound() 
{
    // Act
    Students nonExistentStudent = manager.searchStudent("S349");

    // Assert
    assertNull(nonExistentStudent);  // Expecting null since "S349" shouldn't exist
}


}
