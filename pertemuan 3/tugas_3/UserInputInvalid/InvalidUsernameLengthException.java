package tugas_3.UserInputInvalid;

public class InvalidUsernameLengthException extends Exception {
    public InvalidUsernameLengthException() {
        super("\tATTENTION: Username length must be between 5-20 characters.\n");
    }
}