import CostCalculationStrategy.Implementation.DayWiseCost;
import CostCalculationStrategy.Implementation.HourlyCost;
import EntryGate.EntryGate;
import ExitGate.ExitGate;
import ParkingManager.ParkingManager;
import ParkingSpot.Implementation.FourWheelerSpot;
import ParkingSpot.Implementation.TwoWheelerSpot;
import ParkingSpot.ParkingSpot;
import Ticket.Ticket;
import Vehicle.Vehicle;
import Vehicle.VehicleType;

public class Main {

    /*
    * Requirements:-
    * Objects = Vehicle, Entry Gate, Parking Manager, Ticket, Parking Spot, Exit Gate
    * Sub Requirements:-
    * Vehicle
    * */
    public static void main(String[] args) {
        EntryGate entryGate = new EntryGate();
        ParkingManager twoWheelerManager = entryGate.getTwoWheelerParkingManagerFactory().getParkingManager();
        ParkingManager fourWheelerManager = entryGate.getFourWheelerParkingManagerFactory().getParkingManager();

        ExitGate exitGate = new ExitGate(new HourlyCost());

        //Creating parking slots......
        ParkingSpot slot1 = new TwoWheelerSpot(1);
        ParkingSpot slot2 = new TwoWheelerSpot(2);
        twoWheelerManager.addParking(slot1);
        twoWheelerManager.addParking(slot2);

        ParkingSpot slot3 = new FourWheelerSpot(3);
        ParkingSpot slot4 = new FourWheelerSpot(4);
        fourWheelerManager.addParking(slot3);
        fourWheelerManager.addParking(slot4);

        //When any new Vehicle comes
        Vehicle vehicle1 = new Vehicle(7782, VehicleType.FourWheeler);
        ParkingSpot vehicle1Slot = null;
        if(vehicle1.getVehicleType() == VehicleType.TwoWheeler) {
            vehicle1Slot = twoWheelerManager.findParking(vehicle1);
        }
        else {
            vehicle1Slot = fourWheelerManager.findParking(vehicle1);
        }

        //Vehicle getting Ticket
        if(vehicle1Slot != null) {
            Ticket vehicle1Ticket = new Ticket(12, vehicle1, vehicle1Slot);
            vehicle1.setTicket(vehicle1Ticket);
        }

        //Vehicle exiting the parking lot
        exitGate.getBill(vehicle1.getTicket());
    }
}