package tugas.animals;

import java.util.Random;

import tugas.interfaces.IFlyer;

public class Bird extends Animal implements IFlyer {
    public void takeOff() {
        System.out.println(toString() + " taking off.");
    }

    public void land() {
        System.out.println(toString() + " is landing.");
    }

    public void fly() {
        System.out.println(toString() + " is flying.");
    }

    public void buildNest() {
        System.out.println(toString() + " is building a nest.");
    }

    public void layEggs() {
        Random r = new Random();
        System.out.println(toString() + " is laying " + r.nextInt(1, 11) + "eggs.");
    }

    public void eat() {
        System.out.println(toString() + " is hungry, so it eats.");
    }
}
