class ExitGate {
    private ParkingManager manager;

    public ExitGate(ParkingManager manager) {
        this.manager = manager;
    }

    public void vehicleArrived(Vehicle vehicle) {
        Ticket ticket = vehicle.getTicket();
        processPayment(ticket);
        System.out.println("Vehicle removed Successfully from EXIT 1");
        updateParkingSpot(ticket);
    }

    private void processPayment(Ticket ticket) {
        // Placeholder for payment logic
    }

    private void updateParkingSpot(Ticket ticket) {
        if (ticket != null) {
            manager.freeParkingSpot(ticket.getParkingSpot());
        }
    }
}