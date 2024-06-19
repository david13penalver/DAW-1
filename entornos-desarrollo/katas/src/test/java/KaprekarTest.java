import org.example.Kaprekar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KaprekarTest {
    private Kaprekar kaprekar;

    @Nested
    @DisplayName("Constructores")
    public class Constructors {

        @Test
        @DisplayName("Empty constructor exists")
        void emptyConstructor() {
            Kaprekar kaprekar = new Kaprekar();
        }

        @Test
        @DisplayName("Constructor with one string number")
        void constructorWithInt() {
            Kaprekar kaprekar = new Kaprekar("1");
        }
    }

    @Nested
    @DisplayName("Number entries")
    public class NumberEntries {

        @BeforeEach
        public void setUp() {
            kaprekar = new Kaprekar();
        }

        @Test
        @DisplayName("The number has 4 digits")
        void fourNumbers() {
            boolean result = kaprekar.hasFourDigits("1234");;

            assertTrue(result);
        }

        @Test
        @DisplayName("The number has 4 digits 2")
        void fourNumbers_2() {
            boolean result = kaprekar.hasFourDigits("5678");;

            assertTrue(result);
        }

        @Test
        @DisplayName("The number doesn't have 4 digits")
        void threeNumbers() {
            boolean result = kaprekar.hasFourDigits("100");;

            assertFalse(result);
        }

        @Test
        @DisplayName("0001 counts as a 4-number-digit")
        void zerosAtLeftCount() {
            boolean result = kaprekar.hasFourDigits("0123");;

            assertTrue(result);
        }

        @Test
        @DisplayName("The number has at least two different digits. False number")
        void notDifferentDigits() {
            boolean result = kaprekar.hasTwoDifferentDigits("1111");

            assertTrue(result);
        }

        @Test
        @DisplayName("The number has at least two different digits")
        void differentDigits() {
            boolean result = kaprekar.hasTwoDifferentDigits("0123");

            assertFalse(result);
        }
    }

    @Nested
    @DisplayName("Calculations")
    public class Calculations {
        @BeforeEach
        void setUp() {
            kaprekar = new Kaprekar();
        }

        @Test
        @DisplayName("Number sorted is rested by number inverse rested")
        void numberSortedIsRestedByInverseSortedNumber() {
            String result = kaprekar.kaprekarMethod("4851");

            assertEquals("Yes", result);
        }
    }

}
