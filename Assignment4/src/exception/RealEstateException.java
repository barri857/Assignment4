package exception;

public class RealEstateException extends Exception {
    public RealEstateException(String message) {
        super(message);
    }
}

class InvalidInputException extends RealEstateException {
    public InvalidInputException(String m) { super(m); }
}