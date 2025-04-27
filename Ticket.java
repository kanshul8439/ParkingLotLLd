class Ticket {
    private int ticketId;
    private ParkingSpot parkingSpot;
    private int entryTime;

    public Ticket() {
        this.ticketId = 0;
        this.entryTime = 0;
        this.parkingSpot = null;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(int entryTime) {
        this.entryTime = entryTime;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public void print() {
        System.out.println("-----TICKET GENERATED Successfully---------");
        System.out.println("TicketId :: " + ticketId + " Entry Time " + entryTime);
    }
}
