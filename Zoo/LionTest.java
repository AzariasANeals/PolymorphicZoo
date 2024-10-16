package Zoo;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class LionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LionTest
{
    /**
     * Default constructor for test class LionTest
     */
    public LionTest()
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
        Lion tester = new Lion("Simba");
        String expected = "Simba";
        
        assertEquals(expected, tester.getName());
    }
    
    @Test
    public void testMakeSound(){
        Lion tester = new Lion("Simba");
        String expected = Lion.LION_SOUND;
        tester.makeSound();
        
        assertEquals(expected, tester.getOutputSound());
    }

        
    @Test
    public void testMakeSoundTwice(){
        Lion tester = new Lion("Simba");
        String expected = Lion.LION_SOUND + Lion.LION_SOUND;
        tester.makeSound(2);
        
        assertEquals(expected, tester.getOutputSound());
    }
    
    // Edge Case Unit Testing
    @Test
    public void testMakeSoundZeroTimes(){
        Lion tester = new Lion("Simba");
        String expected = "";
        tester.makeSound(0);
        
        assertEquals(expected, tester.getOutputSound());
    }
    
    @Test
    public void testMakeSoundNegativeTimes(){
        Lion tester = new Lion("Simba");
        String expected = "";
        tester.makeSound(-1);
        
        assertEquals(expected, tester.getOutputSound());
    }
    
    @Test
    public void testNullGetName(){
        Lion tester = new Lion(null);
        String expected = null;
        
        assertEquals(expected, tester.getName());
    }
}
