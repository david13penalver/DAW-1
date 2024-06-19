import org.example.PasswordValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordValidatorTest {
    private PasswordValidator passwordValidator;

    @BeforeEach
    @Disabled
    public void setUp() {
        passwordValidator = null;
    }

    @Test
    @DisplayName("Class exists")
    void classExists() {
    }

    @Test
    @DisplayName("Password is a String")
    void passwordIsBoolean() {
        boolean expected = false;
        boolean result = false;

        assertEquals(expected, result);
    }

    @Test
    @Disabled("Disabled because it doesn't implement capital letter validation")
    @DisplayName("Password is at least 8 characters long")
    void passwordIsAtLeast8CharactersLong() {
        boolean expected = passwordValidator.validate("12345678");
        boolean result = true;

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Password is at least 8 characters long. 7 characters test")
    void passwordIsAtLeast8CharactersLong_7Characters() {
        boolean expected = passwordValidator.validate("1234567");
        boolean result = false;

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Password has at least 2 numbers")
    void passwordHasMoreThan2Numbers_0NumbersGiven() {
        boolean expected = passwordValidator.validate("qwertyui");
        boolean result = false;

        assertEquals(result, expected);
    }

    @Test
    @Disabled("Disabled because it doesn't implement capital letter validation")
    @DisplayName("Password has at least 2 numbers")
    void passwordHasMoreThan2Numbers_2NumbersGiven() {
        boolean expected = passwordValidator.validate("qwertyui12");
        boolean result = true;

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Password has at least 1 capital letter")
    void passwordHasatLeast2CapitalLetters() {
        boolean expected = passwordValidator.validate("nocapital123");
        boolean result = false;

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Password has at least 1 capital letter")
    void passwordHasatLeast2CapitalLetters2() {
        boolean expected = passwordValidator.validate("nocapital1234");
        boolean result = false;

        assertEquals(expected, result);
    }

    @Test
    @Disabled("Disabled because it doesn't implement special character validation")
    @DisplayName("Password has at least 1 capital letter")
    void passwordHasatLeast2CapitalLetters3() {
        boolean expected = passwordValidator.validate("Yescapital1234");
        boolean result = true;

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Password has at least 1 capital letter")
    void hasSpecialCharacter() {
        boolean expected = passwordValidator.validate("NoSpecialCharacter1234");
        boolean result = false;

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Password has at least 1 capital letter")
    void hasSpecialCharacter2() {
        boolean expected = passwordValidator.validate("YesSpeci@lCharacter1234");
        boolean result = true;

        assertEquals(expected, result);
    }


}
