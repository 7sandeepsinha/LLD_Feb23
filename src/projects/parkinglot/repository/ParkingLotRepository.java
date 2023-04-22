package projects.parkinglot.repository;

import projects.parkinglot.exception.ParkingLotAlreadyExistsException;
import projects.parkinglot.exception.ParkingLotNotAvailableException;
import projects.parkinglot.model.Gate;
import projects.parkinglot.model.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    private Map<Long, ParkingLot> parkingLotMap;
    private Map<Gate, ParkingLot> gateParkingLotMap;
    // ParkingLot1 -> G1, G2, G3
    // ParkingLot2 -> G4, G5, G6
    // G1, ParkingLot1
    // G2, ParkingLot1
    // G3, ParkingLot1
    // G4, ParkingLot2
    // G5, ParkingLot2
    // G6, ParkingLot2

    public ParkingLotRepository() {
        this.parkingLotMap = new HashMap<>();
        this.gateParkingLotMap = new HashMap<>();
    }

    public ParkingLot save(ParkingLot parkingLot) throws ParkingLotAlreadyExistsException {
        if(parkingLotMap.containsKey(parkingLot.getId())){
            throw new ParkingLotAlreadyExistsException();
        }
        //creating the mapping for gate to parkingLot
        for(Gate gate : parkingLot.getGates()){
            gateParkingLotMap.put(gate, parkingLot);
        }
        return parkingLotMap.put(parkingLot.getId(), parkingLot);
    }

    public ParkingLot get(long parkingLotId){
        return parkingLotMap.get(parkingLotId);
    }

    public ParkingLot update(ParkingLot parkingLot){
        return parkingLotMap.put(parkingLot.getId(), parkingLot);
    }

    public ParkingLot getParkingLotFromGate(Gate gate) throws ParkingLotNotAvailableException {
        if(gateParkingLotMap.containsKey(gate))
            return gateParkingLotMap.get(gate);
        else
            throw new ParkingLotNotAvailableException();
    }
}
