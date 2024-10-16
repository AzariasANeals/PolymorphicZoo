package Zoo;

/**
 * This is the Elephant class it is a subclass of the Animal class.
 * It will return the sound that an elephant makes.
 */
public class Elephant extends Animal
{
    public static final String ELEPHANT_SOUND = "Baaaaaaroooomph! ";

    public Elephant(String name)
    {
        super(name);
    }

    @Override
    public void makeSound(){
        sound = ELEPHANT_SOUND;
        outputSound.append(sound);
        System.out.print(sound);
    }

}
