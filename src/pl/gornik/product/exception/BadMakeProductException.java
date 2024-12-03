package pl.gornik.product.exception;

public class BadMakeProductException extends RuntimeException {
    public BadMakeProductException(String message) {
        super(message);
    }
}
