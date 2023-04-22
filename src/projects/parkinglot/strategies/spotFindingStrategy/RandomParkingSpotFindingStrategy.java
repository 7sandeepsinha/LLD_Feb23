package projects.parkinglot.strategies.spotFindingStrategy;

import projects.parkinglot.exception.ParkingSpotNotAvailable;
import projects.parkinglot.model.*;
import projects.parkinglot.service.ParkingSpotVehicleTypeMatchingService;

public class RandomParkingSpotFindingStrategy implements ParkingSpotFindingStrategy{

    private ParkingSpotVehicleTypeMatchingService parkingSpotVehicleTypeMatchingService;

    public RandomParkingSpotFindingStrategy(ParkingSpotVehicleTypeMatchingService parkingSpotVehicleTypeMatchingService) {
        this.parkingSpotVehicleTypeMatchingService = parkingSpotVehicleTypeMatchingService;
    }

    @Override
    public ParkingSpot getAvailableSpot(VehicleType vehicleType, ParkingLot parkingLot) throws ParkingSpotNotAvailable {
        for(ParkingFloor parkingFloor : parkingLot.getParkingFloors()){
            for(ParkingSpot parkingSpot : parkingFloor.getParkingSpots()){
                if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE) &&
                        parkingSpotVehicleTypeMatchingService.matches(parkingSpot.getSpotType(), vehicleType)){
                    return parkingSpot;
                }
            }
        }
        throw new ParkingSpotNotAvailable();
    }

    // to optimise this, we can maintain a counter on floor level and parkingLot level to check if any spots are available
}
