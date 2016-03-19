package Exceptions;

public class InvalidArguments extends Throwable {
    public InvalidArguments() {
        super("Invalid Arguments: " +
                "sides should be positive number");
    }
}
