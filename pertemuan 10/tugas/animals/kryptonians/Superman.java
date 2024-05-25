package tugas.animals.kryptonians;

import tugas.interfaces.IFlyer;

public class Superman extends Kryptonian implements IFlyer { 
    private String name;

    public Superman(String name) {
        this.name = name;
    }

    public void takeOff() {
        System.out.println(toString() + " taking off.");
    }

    public void land() {
        System.out.println(toString() + " is landing.");
    }

    public void fly() {
        System.out.println(toString() + " is flying.");
    }

    public void leapBuilding() {
        System.out.println(toString() + " leaps to another building.");
    }

    public void stopBullet() {
        System.out.println(toString() + " stopping bullets.");
    }

    public void eat() {
        System.out.println(toString() + " is hungry, so he eats.");
    }
}
