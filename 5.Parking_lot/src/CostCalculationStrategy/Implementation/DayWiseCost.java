package CostCalculationStrategy.Implementation;

import CostCalculationStrategy.CostCalculationStrategy;
import ParkingSpot.Implementation.FourWheelerSpot;
import ParkingSpot.Implementation.TwoWheelerSpot;
import ParkingSpot.ParkingSpot;
import Ticket.Ticket;

public class DayWiseCost implements CostCalculationStrategy {
    @Override
    public int price(Ticket ticket) {
        int startTime = ticket.getTime();
        ParkingSpot parkingSpot = ticket.getParkingSpot();
        if(parkingSpot instanceof TwoWheelerSpot) {
            TwoWheelerSpot twoWheelerSpot = (TwoWheelerSpot) parkingSpot;
            return twoWheelerSpot.price + 100;
        }
        else {
            FourWheelerSpot fourWheelerSpot = (FourWheelerSpot) parkingSpot;
            return fourWheelerSpot.price + 400;
        }
    }
}
