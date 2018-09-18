package lt.markussohn.exceptions;

public class DatabaseUnavailableException extends RuntimeException {
    public DatabaseUnavailableException(Throwable cause) {
        super(cause);
    }

    public DatabaseUnavailableException() {
    }
}
