package genspark.assignments.section6;

import genspark.assignments.Assignment;
import org.apache.cassandra.utils.StreamingHistogram;

public class Zombie extends Humanoid implements Assignment{
    private int brainLust;
    private int strength;
    private int intelligence;
    private int health;
    private int compassion;

    //Getters
    public int getBrainLust() {
        return brainLust;
    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getHealth() {
        return health;
    }

    public int getCompassion() {
        return compassion;
    }

    //Setters
    public void setBrainLust(int brainLust) {
        this.brainLust = brainLust;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setCompassion(int compassion) {
        this.compassion = compassion;
    }

    // Default Constructor
    public Zombie() {
    }

    // Parameterized Constructor
    public Zombie(int brainLust, int strength, int intelligence, int health, int compassion) {
        this.brainLust = brainLust;
        this.strength = strength;
        this.intelligence = intelligence;
        this.health = health;
        this.compassion = compassion;
    }

    // Method: return parent class
    public Class whoIsTheParent() {
        Humanoid hmn = new Humanoid();
        return hmn.getClass();
    }

    // Method: Attack
    public String attack(Object obj) {
        Human human = (Human)obj;
        String retStr = "";
        int zombieStrength = this.getStrength();
        human.setHealth(human.getHealth()-zombieStrength);
        if (human.getHealth()<=3) {
            retStr = "The zombie bites the human for " +
                    String.valueOf(zombieStrength) +
                    " damage, the human has died...";
        } else {
            retStr = "The zombie bites the human for " +
                    String.valueOf(zombieStrength) +
                    " damage, the human survives but will be turning soon...";
        }
        return retStr;
    }
}
