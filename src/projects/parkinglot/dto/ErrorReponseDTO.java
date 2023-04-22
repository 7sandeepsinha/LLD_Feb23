package projects.parkinglot.dto;

public class ErrorReponseDTO extends ResponseDTO{
    private String message;
    private int errorCode;

    public ErrorReponseDTO(String message, int errorCode) {
        this.message = message;
        this.errorCode = errorCode;
    }

    public ErrorReponseDTO() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}

