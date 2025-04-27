import java.util.*;
public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Vehicle 1", CarType.TwoWheeler);
        Vehicle v2 = new Vehicle("Vehicle 2", CarType.FourWheeler);
        Vehicle v3 = new Vehicle("Vehicle 3", CarType.TwoWheeler);
        Vehicle v4 = new Vehicle("Vehicle 4", CarType.FourWheeler);

        ParkingManager manager = new ParkingManager();
        EntranceGate entryGate = new EntranceGate(manager);
        ExitGate exitGate = new ExitGate(manager);

        entryGate.vehicleArrived(v1);
        entryGate.vehicleArrived(v2);
        entryGate.vehicleArrived(v3);
        entryGate.vehicleArrived(v4);

        exitGate.vehicleArrived(v1);
        exitGate.vehicleArrived(v2);
        exitGate.vehicleArrived(v3);
        exitGate.vehicleArrived(v4);
    }
}