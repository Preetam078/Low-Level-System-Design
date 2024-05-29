package EntryGate;

import ParkingManager.ParkingManagerFactory;
import ParkingSpot.ParkingSpot;
import Vehicle.Vehicle;
import Vehicle.VehicleType;
import Ticket.Ticket;

public class EntryGate {
    private ParkingManagerFactory twoWheelerParkingManagerFactory;
    private ParkingManagerFactory fourWheelerParkingManagerFactory;

    public EntryGate() {
        this.twoWheelerParkingManagerFactory = new ParkingManagerFactory(VehicleType.TwoWheeler);
        this.fourWheelerParkingManagerFactory = new ParkingManagerFactory(VehicleType.FourWheeler);

        System.out.println("Entry gate created.....2, 4 wheeler manager created");
    }

    public ParkingManagerFactory getFourWheelerParkingManagerFactory() {
        return fourWheelerParkingManagerFactory;
    }

    public ParkingManagerFactory getTwoWheelerParkingManagerFactory() {
        return twoWheelerParkingManagerFactory;
    }

    public Ticket generateTicket(int time, Vehicle vehicle, ParkingSpot parkingSpot) {
        Ticket ticket = new Ticket(time, vehicle, parkingSpot);
        return ticket;
    }
}
