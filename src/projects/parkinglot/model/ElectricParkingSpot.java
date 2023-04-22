package projects.parkinglot.model;

public class ElectricParkingSpot extends ParkingSpot {
    private ElectricCharger eLectricCharger;

    public ElectricParkingSpot(ElectricCharger eLectricCharger) {
        this.eLectricCharger = eLectricCharger;
    }
}
