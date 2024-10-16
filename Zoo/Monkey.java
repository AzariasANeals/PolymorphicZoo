package Zoo;

/**
 * This is the Monkey class. It is a subclass of the Animal class. It will 
 * return the sound that a monkey makes.
 */
public class Monkey extends Animal
{
    public static final String MONKEY_SOUND = "OO OO AH AH! ";
    
    public Monkey(){
        super("Ceasar");
    }

    public Monkey(String name)
    {
        super(name);    
    }

    @Override
    public void makeSound(){
        sound = MONKEY_SOUND;
        outputSound.append(sound);
        System.out.print(sound);
    }

}
