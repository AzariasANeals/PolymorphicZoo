package Zoo;

/**
 * This is the Animal class it will take in a name and animal type and return the name and the sound
 * that the animal makes.
 */
public abstract class Animal
{
    protected String name;

    // This is a unit-testing hook.
    protected String sound;
    protected StringBuilder outputSound;

    public Animal(String name){
        this.name = name;
        outputSound = new StringBuilder("");
    }

    public abstract void makeSound();

    public void makeSound(int times){
        outputSound = new StringBuilder("");
        
        if(times <= 0){
            return;
        }

        for(int i=0; i<times;i++){
            makeSound();
        }

    }

    public String getName(){
        return name;
    }

    // Unit Test Hook to test makeSound() method.
    public String getOutputSound(){
        return outputSound.toString();
    }

}
