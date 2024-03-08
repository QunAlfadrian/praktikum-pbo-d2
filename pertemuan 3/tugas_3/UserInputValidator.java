package tugas_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import tugas_3.UserInputInvalid.*;

public class UserInputValidator {
    public static void validateUsername(String username) {
        Pattern uNamePattern, uNameLength; 
        Matcher uNamePatternMatcher, unameLengthMatcher;

        uNamePattern = Pattern.compile("[a-zA-Z][a-zA-z0-9_]+");
        uNameLength = Pattern.compile("[a-zA-Z][a-zA-Z0-9_]+{5,20}");
        try {
            unameLengthMatcher = uNameLength.matcher(username);
            if (!unameLengthMatcher.matches()) {
                throw new InvalidUsernameLengthException();
            }

            uNamePatternMatcher = uNamePattern.matcher(username);
            if (!uNamePatternMatcher.matches()) {
                throw new InvalidUsernamePatternException();
            }
        } catch (InvalidUsernameLengthException ex) {
            System.out.println(ex.getMessage());
        } catch (InvalidUsernamePatternException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void validateEmail(String email) {

    }

    public static void validateAge(int age) {

    }
}
