class EntranceGate {
    private ParkingManager manager;

    public EntranceGate(ParkingManager manager) {
        this.manager = manager;
    }

    public void vehicleArrived(Vehicle vehicle) {
        CarType type = vehicle.getVehicleType();
        ParkingSpot spot = null;

        if (type == CarType.TwoWheeler) {
            spot = manager.getParkingSpot(ParkingSpotType.TwoWheelerSpot);
        } else if (type == CarType.FourWheeler) {
            spot = manager.getParkingSpot(ParkingSpotType.FourWheelerSpot);
        }

        if (spot == null) {
            System.out.println("Parking FULL !!!!!");
            return;
        }

        spot.parkVehicle(vehicle);
        Ticket ticket = generateTicket(spot);
        vehicle.setTicket(ticket);
    }

    private Ticket generateTicket(ParkingSpot spot) {
        Ticket ticket = new Ticket();
        ticket.setTicketId(0); // placeholder
        ticket.setEntryTime(0); // placeholder
        ticket.setParkingSpot(spot);
        ticket.print();
        return ticket;
    }
}
