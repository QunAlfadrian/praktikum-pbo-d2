package tugas.vehicles.airplanes;

public class SeaPlane extends Airplane{
    private double maxLoad;

    public SeaPlane(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public SeaPlane() { }

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
        return this.getClass().getSimpleName() + " dapat take-off dan mendarat di perairan laut";
    }
}
