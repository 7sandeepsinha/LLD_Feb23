package projects.tictactoe.exception;

public class InvalidGameConstructionParametersException extends Exception{
    public InvalidGameConstructionParametersException() {
    }

    public InvalidGameConstructionParametersException(String message) {
        super(message);
    }

    public InvalidGameConstructionParametersException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidGameConstructionParametersException(Throwable cause) {
        super(cause);
    }

    public InvalidGameConstructionParametersException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
