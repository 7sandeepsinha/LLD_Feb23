package projects.parkinglot.strategies.spotFindingStrategy;

import projects.parkinglot.exception.ParkingSpotNotAvailable;
import projects.parkinglot.model.ParkingLot;
import projects.parkinglot.model.ParkingSpot;
import projects.parkinglot.model.VehicleType;

public interface ParkingSpotFindingStrategy {
    ParkingSpot getAvailableSpot(VehicleType vehicleType, ParkingLot parkingLot) throws ParkingSpotNotAvailable;
}
