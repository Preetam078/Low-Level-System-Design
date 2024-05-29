package ExitGate;

import CostCalculationStrategy.CostCalculationStrategy;
import ParkingSpot.Implementation.FourWheelerSpot;
import ParkingSpot.Implementation.TwoWheelerSpot;
import ParkingSpot.ParkingSpot;
import Ticket.Ticket;

public class ExitGate {
    CostCalculationStrategy costCalcutionStrategy;
    public ExitGate(CostCalculationStrategy costCalcutionStrategy) {
        this.costCalcutionStrategy = costCalcutionStrategy;
    }
    public void getBill(Ticket ticket) {
        int totalBill = costCalcutionStrategy.price(ticket);
        System.out.println("Your Parking Bill is...."+totalBill);
        ParkingSpot parkingSpot = ticket.getParkingSpot();
        if(parkingSpot instanceof TwoWheelerSpot) {
            TwoWheelerSpot twoWheelerSpot = (TwoWheelerSpot) parkingSpot;
            twoWheelerSpot.removeVehicle();
        }
        else {
            FourWheelerSpot fourWheelerSpot = (FourWheelerSpot) parkingSpot;
            fourWheelerSpot.removeVehicle();
        }
    }
}
