package projects.parkinglot.model;

import java.util.List;

public class ParkingLot extends BaseModel {
    private String address;
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    //TODO : add a flag/counter for checking whether parking lot is full or not
    //private int remainingSpots;
    //private boolean isSpotAvailable;


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }
}
