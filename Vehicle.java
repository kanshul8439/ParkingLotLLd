class Vehicle {
    private String vehicleNumber;
    private CarType vehicleType;
    private Ticket ticket;

    public Vehicle(String number, CarType type) {
        this.vehicleNumber = number;
        this.vehicleType = type;
        this.ticket = null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public CarType getVehicleType() {
        return vehicleType;
    }
}