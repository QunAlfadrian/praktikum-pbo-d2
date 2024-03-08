package tugas_3.UserInputInvalid;

public class InvalidUsernamePatternException extends Exception {
    public InvalidUsernamePatternException() {
        super("\tATTENTION: Username must start with a letter\n\tATTENTION: Username may only contains letters, numbers, and underscore (_)\n");
    }
}
