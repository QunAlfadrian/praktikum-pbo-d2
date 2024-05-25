package tugas;

import java.util.ArrayList;
import java.util.List;

import tugas.interfaces.IFlyer;
import tugas.vehicles.airplanes.Airplane; 

public class AirPort {
    private List<IFlyer> airplanes;
    private String name;

    public AirPort(String name) {
        this.name = name;
        airplanes = new ArrayList<>();
    }

    public String givePermissionToLand(IFlyer flyer) {
        if (flyer instanceof Airplane) {
            airplanes.add(flyer);
            return "Permission granted.";
        } 
        return "Permission denied.";
    }
}
