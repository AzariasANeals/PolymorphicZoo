package Zoo;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ElephantTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ElephantTest
{
    /**
     * Default constructor for test class ElephantTest
     */
    public ElephantTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    //Normal Case Unit Testing
    @Test
    public void testGetName(){
        Elephant tester = new Elephant("Horton");
        String expected = "Horton";
        
        assertEquals(expected, tester.getName());
    }
    
    @Test
    public void testMakeSound(){
        Elephant tester = new Elephant("Horton");
        String expected = Elephant.ELEPHANT_SOUND;
        tester.makeSound();
        
        assertEquals(expected, tester.getOutputSound());
    }

        
    @Test
    public void testMakeSoundTwice(){
        Elephant tester = new Elephant("Horton");
        String expected = Elephant.ELEPHANT_SOUND + Elephant.ELEPHANT_SOUND;
        tester.makeSound(2);
        
        assertEquals(expected, tester.getOutputSound());
    }
    
    // Edge Case Unit Testing
    @Test
    public void testMakeSoundZeroTimes(){
        Elephant tester = new Elephant("Horton");
        String expected = "";
        tester.makeSound(0);
        
        assertEquals(expected, tester.getOutputSound());
    }
    
    @Test
    public void testMakeSoundNegativeTimes(){
        Elephant tester = new Elephant("Horton");
        String expected = "";
        tester.makeSound(-1);
        
        assertEquals(expected, tester.getOutputSound());
    }
    
    @Test
    public void testNullGetName(){
        Elephant tester = new Elephant(null);
        String expected = null;
        
        assertEquals(expected, tester.getName());
    }
}
