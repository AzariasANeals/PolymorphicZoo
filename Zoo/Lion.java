package Zoo;

/**
 * This is the Lion class, it is a subclass of the Animal class.
 * It will return the sound that a Lion makes.
 */
public class Lion extends Animal
{
    public static final String LION_SOUND = "Rooooar! ";
    public Lion(String name)
    {
        super(name);
    }

    @Override
    public void makeSound(){
        sound = LION_SOUND;
        outputSound.append(sound);
        System.out.print(sound);
    }
}
