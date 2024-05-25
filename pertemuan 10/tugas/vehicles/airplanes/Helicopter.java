package tugas.vehicles.airplanes;

public class Helicopter extends Airplane {
    private double maxLoad;

    public Helicopter(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public Helicopter() { }

    @Override
    public double calcFuelEfficiency() {
        return 0;
    }

    @Override
    public double calcTripDistance() {
        return 0;
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

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " hanya memerlukan landasan kecil";
    }
}
