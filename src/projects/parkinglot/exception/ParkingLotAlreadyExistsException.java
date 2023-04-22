package projects.parkinglot.exception;

public class ParkingLotAlreadyExistsException extends Exception {
    public ParkingLotAlreadyExistsException() {
    }

    public ParkingLotAlreadyExistsException(String message) {
        super(message);
    }

    public ParkingLotAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParkingLotAlreadyExistsException(Throwable cause) {
        super(cause);
    }

    public ParkingLotAlreadyExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
