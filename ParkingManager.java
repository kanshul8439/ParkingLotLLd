import java.util.ArrayList;
import java.util.List;

class ParkingManager {
    private final List<List<ParkingSpot>> parkingList;

    public ParkingManager() {
        parkingList = new ArrayList<>();

        List<ParkingSpot> twoWheelers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            twoWheelers.add(new ParkingSpot(100 + i, ParkingSpotType.TwoWheelerSpot));
        }
        parkingList.add(twoWheelers);

        List<ParkingSpot> fourWheelers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            fourWheelers.add(new ParkingSpot(200 + i, ParkingSpotType.FourWheelerSpot));
        }
        parkingList.add(fourWheelers);
    }

    public ParkingSpot getParkingSpot(ParkingSpotType type) {
        for (List<ParkingSpot> row : parkingList) {
            for (ParkingSpot spot : row) {
                if (spot != null && spot.isEmpty() && spot.getType() == type) {
                    return spot;
                }
            }
        }
        return null;
    }

    public void freeParkingSpot(ParkingSpot spot) {
        for (List<ParkingSpot> row : parkingList) {
            for (ParkingSpot s : row) {
                if (s.getId() == spot.getId()) {
                    s.removeVehicle();
                    return;
                }
            }
        }
    }
}