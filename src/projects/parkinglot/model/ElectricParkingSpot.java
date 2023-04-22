package projects.parkinglot.model;

public class ElectricParkingSpot extends ParkingSpot {
    private ElectricCharger eLectricCharger;

    public ElectricParkingSpot(ElectricCharger eLectricCharger) {
        this.eLectricCharger = eLectricCharger;
    }
}


// A -> B -> C  : C holds all non-private attributes and methods from both A and B