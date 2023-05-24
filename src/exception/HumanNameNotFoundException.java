package exception;

public class HumanNameNotFoundException extends RuntimeException {

    public HumanNameNotFoundException() {
    }

    public HumanNameNotFoundException(String message) {
        super(message);
    }

    public HumanNameNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
