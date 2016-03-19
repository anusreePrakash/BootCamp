package Exceptions;

public class InvalidChanceException extends Exception {
    public InvalidChanceException(double value) {
        super("Chance should be greater than 0 but lesser than 1 but got : "+value);
    }
}
