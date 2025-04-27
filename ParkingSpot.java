class ParkingSpot {
    private int id;
    private boolean isEmpty;
    private double cost;
    private Vehicle vehicle;
    private ParkingSpotType type;

    public ParkingSpot(int id, ParkingSpotType type) {
        this.id = id;
        this.type = type;
        this.cost = (type == ParkingSpotType.TwoWheelerSpot) ? 500 : 1000;
        this.vehicle = null;
        this.isEmpty = true;
    }

    public void parkVehicle(Vehicle vehicle) {
        System.out.println("Vehicle Parked of Type: " + vehicle.getVehicleType());
        if (vehicle != null) {
            this.vehicle = vehicle;
            this.isEmpty = false;
        }
    }

    public void removeVehicle() {
        System.out.println("Parking Spot Freed : Type :" + type);
        this.vehicle = null;
        this.isEmpty = true;
    }

    public ParkingSpotType getType() {
        return type;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public int getId() {
        return id;
    }
}