package projects.parkinglot.service;

import projects.parkinglot.exception.ParkingLotNotAvailableException;
import projects.parkinglot.exception.ParkingSpotNotAvailable;
import projects.parkinglot.model.*;
import projects.parkinglot.repository.ParkingLotRepository;
import projects.parkinglot.strategies.spotFindingStrategy.ParkingSpotFindingStrategy;

import java.util.Date;

public class TicketService {
    private ParkingSpotFindingStrategy parkingSpotFindingStrategy;
    private ParkingLotRepository parkingLotRepository;

    public TicketService(ParkingSpotFindingStrategy parkingSpotFindingStrategy, ParkingLotRepository parkingLotRepository) {
        this.parkingSpotFindingStrategy = parkingSpotFindingStrategy;
        this.parkingLotRepository = parkingLotRepository;
    }

    public Ticket getTicket(Vehicle vehicle, EntryGate entryGate) throws ParkingLotNotAvailableException, ParkingSpotNotAvailable {
        ParkingSpot availableSpot = parkingSpotFindingStrategy.getAvailableSpot(vehicle.getVehicleType(),
                parkingLotRepository.getParkingLotFromGate(entryGate));

        Ticket ticket = new Ticket();
        ticket.setGate(entryGate);
        ticket.setGeneratedBy(entryGate.getOperator());
        ticket.setEntryTime(new Date().toString());
        ticket.setParkingSpot(availableSpot);
        ticket.setVehicle(vehicle);
        return ticket;
        //TODO : create ticket repository and save this ticket before returning to user
    }

    //Steps
    // 1. Find available Spot
    // 2. Generate ticket object
    // 3. Add all the details in ticket object
    // 4. Save and return

    public void updateParkingSpotStatus(ParkingLot parkingLot, ParkingSpot parkingSpot){
        for(ParkingFloor parkingFloor : parkingLot.getParkingFloors()){
            for(ParkingSpot spot : parkingFloor.getParkingSpots()){
                if(spot.equals(parkingSpot)){
                    if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE)){
                        parkingSpot.setParkingSpotStatus(ParkingSpotStatus.UNAVAILABLE);
                    } else {
                        parkingSpot.setParkingSpotStatus(ParkingSpotStatus.AVAILABLE);
                    }
                }
            }
        }
        parkingLotRepository.update(parkingLot);
    }
}
