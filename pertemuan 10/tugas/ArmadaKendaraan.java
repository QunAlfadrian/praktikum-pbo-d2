package tugas;

import java.util.ArrayList;
import java.util.List;

import tugas.vehicles.Vehicle;

public class ArmadaKendaraan {
    List<Vehicle> armada;

    public ArmadaKendaraan() {
        armada = new ArrayList<>();
    }

    public void tambahArmada(List<? extends Vehicle> kendaraan) {
        armada.addAll(kendaraan);
    }

    public List<Vehicle> getAllArmada() {
        return this.armada;
    }
}
