package projects.parkinglot.repository;

import projects.parkinglot.exception.ParkingLotAlreadyExistsException;
import projects.parkinglot.model.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    private Map<Long, ParkingLot> parkingLotMap;

    public ParkingLotRepository() {
        this.parkingLotMap = new HashMap<>();
    }

    public ParkingLot save(ParkingLot parkingLot) throws ParkingLotAlreadyExistsException {
        if(parkingLotMap.containsKey(parkingLot.getId())){
            throw new ParkingLotAlreadyExistsException();
        }
        return parkingLotMap.put(parkingLot.getId(), parkingLot);
    }

    public ParkingLot get(long parkingLotId){
        return parkingLotMap.get(parkingLotId);
    }

    public ParkingLot update(ParkingLot parkingLot){
        return parkingLotMap.put(parkingLot.getId(), parkingLot);
    }
}
