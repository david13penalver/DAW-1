import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void convert() {
        // ACT  Arrange Act Assert
        // Arrange
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = String.valueOf(98);

        // Act
        String result = fizzbuzz.convert(98);

        // Assert
        assertEquals(expected,result);
    }

    @org.junit.jupiter.api.Test
    void divisibleTres() {
        // ACT  Arrange Act Assert
        // Arrange
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = "fizz";

        // Act
        String result = fizzbuzz.convert(3);

        // Assert
        assertEquals(expected,result);
    }

    @org.junit.jupiter.api.Test
    void divisibleCinco() {
        // ACT  Arrange Act Assert
        // Arrange
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = "buzz";

        // Act
        String result = fizzbuzz.convert(5);

        // Assert
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void divisibleTresOK() {
        // ACT  Arrange Act Assert
        // Arrange
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = "fizz";

        // Act
        String result = fizzbuzz.convert(6);

        // Assert
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void divisibleCincoOK() {
        // ACT  Arrange Act Assert
        // Arrange
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = "buzz";

        // Act
        String result = fizzbuzz.convert(10);

        // Assert
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void divisibleTresCinco() {
        // ACT  Arrange Act Assert
        // Arrange
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = "fizzbuzz";

        // Act
        String result = fizzbuzz.convert(15);

        // Assert
        assertEquals(expected,result);
    }
}