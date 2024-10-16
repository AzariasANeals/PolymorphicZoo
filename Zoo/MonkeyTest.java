package Zoo;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class MonkeyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MonkeyTest
{
    /**
     * Default constructor for test class MonkeyTest
     */
    public MonkeyTest()
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
        Monkey tester = new Monkey("Ceasar");
        String expected = "Ceasar";
        
        assertEquals(expected, tester.getName());
    }
    
    @Test
    public void testMakeSound(){
        Monkey tester = new Monkey("Ceasar");
        String expected = Monkey.MONKEY_SOUND;
        tester.makeSound();
        
        assertEquals(expected, tester.getOutputSound());
    }

        
    @Test
    public void testMakeSoundTwice(){
        Monkey tester = new Monkey("Ceasar");
        String expected = Monkey.MONKEY_SOUND + Monkey.MONKEY_SOUND;
        tester.makeSound(2);
        
        assertEquals(expected, tester.getOutputSound());
    }
    
    // Edge Case Unit Testing
    @Test
    public void testMakeSoundZeroTimes(){
        Monkey tester = new Monkey("Ceasar");
        String expected = "";
        tester.makeSound(0);
        
        assertEquals(expected, tester.getOutputSound());
    }
    
    @Test
    public void testMakeSoundNegativeTimes(){
        Monkey tester = new Monkey("Ceasar");
        String expected = "";
        tester.makeSound(-1);
        
        assertEquals(expected, tester.getOutputSound());
    }
    
    @Test
    public void testNullGetName(){
        Monkey tester = new Monkey(null);
        String expected = null;
        
        assertEquals(expected, tester.getName());
    }
}
