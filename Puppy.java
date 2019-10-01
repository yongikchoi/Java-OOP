//I worked on the homework assignment alone, using only course materials.
import java.util.Random;
/**
 * This class represents a puppy object
 * @author YongIk Choi
 * @version 1.0.0
 */

public class Puppy {
    private String name;
    private int age;
    private int health;
    private static Random rand = new Random();
   

    /**
     * Constructor chaining for puppy, 3 parameters
     * @param name - name of puppy as string
     * @param age - age of puppy as integer
     * @param health - health value of puppy as integer
     */
    public Puppy(String name, int age, int health) {
        this(name);
        this.age = age;
        this.health = health;
    }

    /**
     * Constructor for puppy, 1 parameter
     * @param name - name of puppy as string
     */
    public Puppy(String name)  {

        this.name = name; 
        this.age = rand.nextInt(16);
        this.health = rand.nextInt(31) + 5;

    }

    /**
     * Setter for name
     * @param name - name of puppy as string
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter for age
     * @param age - age of puppy as integer
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Setter for health
     * @param health - health of puppy as integer
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Getter for name
     * @return - return name as string
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for age
     * @return - return age as integer
     */
    public int getAge() {
        return age;
    }

    /**
     * Getter for health
     * @return - return health as integer
     */
    public int getHealth() {
        return health;
    }

    /**
     * Print detail of puppy as string
     * @return - statement as string
     */
    public String toString() {
        return name + ": a puppy " + age + " years old with + " + health + " health";
    }

    /**
     * Determine adoption possibility of puppy
     * @return - adoption possibility as boolean
     */
    public boolean canAdopt() {
        return health >= 50;
    }

    /**
     * fetch with no parameter - method overloading
     */
    public void fetch() {
        health++;
    }

    /**
     * fetch with parameter of boolean - method overloading
     * @param inside - puppy is inside or outside as boolean
     */
    public void fetch(boolean inside) {
        if (inside) {
            health = health + 5;
        } else {
            health = health + 10;
        }
    }

    /**
     * fetch with parameter of integer - method overloading
     * @param distance - distance ran by puppy as integer
     */
    public void fetch(int distance) {
        int increment = distance / 10;
        health = health + increment;
    }
}
