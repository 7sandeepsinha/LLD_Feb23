package projects.parkinglot.exception;

public class ParkingLotNotAvailableException extends Exception{
    public ParkingLotNotAvailableException() {
    }

    public ParkingLotNotAvailableException(String message) {
        super(message);
    }

    public ParkingLotNotAvailableException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParkingLotNotAvailableException(Throwable cause) {
        super(cause);
    }

    public ParkingLotNotAvailableException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
