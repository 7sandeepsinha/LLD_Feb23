package projects.parkinglot.exception;

public class ParkingSpotNotAvailable extends Exception{
    public ParkingSpotNotAvailable() {
    }

    public ParkingSpotNotAvailable(String message) {
        super(message);
    }

    public ParkingSpotNotAvailable(String message, Throwable cause) {
        super(message, cause);
    }

    public ParkingSpotNotAvailable(Throwable cause) {
        super(cause);
    }

    public ParkingSpotNotAvailable(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
