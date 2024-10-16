package Zoo;
import java.util.ArrayList;

/**
 * This is the ZooDemo. 
 * 
 * To start this project click on the ZooDemo class and create a new animal (Elephant, Lion, Monkey)
    and give it a name. Then add it to the zoo ArrayList and run the program. It will then return the
    animal name and the sound associated with the animal chosen. 
 */
public class ZooDemo
{
    public static void main(String[] args){
        ArrayList<Animal> zoo = new ArrayList<Animal>();

        Elephant elephant = new Elephant("Dumbo:");
        Lion lion = new Lion("Simba:");
        Monkey monkey = new Monkey("Ceasar:");

        zoo.add(elephant);
        zoo.add(lion);
        zoo.add(monkey);

        for(Animal a: zoo){
            System.out.println(a.getName());
            a.makeSound();
            System.out.println("");
            a.makeSound(3);
            System.out.println("");
            System.out.println(a.getOutputSound());
            System.out.println("");

        }
    }
}
