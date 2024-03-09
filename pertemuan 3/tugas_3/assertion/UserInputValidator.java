package tugas_3.assertion;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserInputValidator {
    public static void validateUsername(String username) {
        Pattern uNamePattern;
        Matcher uNameMatcher;

        uNamePattern = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]{4,19}$");
        uNameMatcher = uNamePattern.matcher(username);
        
        assert (username.length() >= 5): "\nUsername must be at least 5 characters long";
        assert (uNameMatcher.matches()): "\nInvalid Username";
        assert (username.length() <= 20): "\nUsername must be at most 20 characters long";
    }

    public static void validateEmail(String email) {
        Pattern emailPattern;
        Matcher emailMatcher;

        emailPattern = Pattern.compile("^[a-zA-Z][a-zA-Z0-9.%+-_]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        emailMatcher = emailPattern.matcher(email);
        assert (emailMatcher.matches()): "\nInvalid email address";
    }

    public static void validateAge(int age) {
        boolean isAgeValid;

        isAgeValid = (17 <= age && age <= 99);
        assert (isAgeValid): "\nAge must be between 17 and 99";
    }
}