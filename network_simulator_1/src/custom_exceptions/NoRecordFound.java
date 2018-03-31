package custom_exceptions;

/**
 * @author 1516392
 */

public class NoRecordFound extends Exception {
    public NoRecordFound() {}
    
    public NoRecordFound(String message) {
        super (message);
    }
}
