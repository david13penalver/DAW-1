package exam2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class LampTest {
    private Lamp lamp;

    @Nested
    @DisplayName("Constructors")
    class Constructors {

        @Test
        @DisplayName("Constructor (double consumption)")
        void constructor1Parametre() {
            lamp = new Lamp(10.5);
            assertEquals(10.5, lamp.getConsumption());
        }

        @Test
        @DisplayName("Constructor (double consumption) i (boolean turnedOn)")
        void constructor2Parametres() {
            lamp = new Lamp(10.5);
            assertAll(
                    () -> assertEquals(10.5, lamp.getConsumption()),
                    () -> assertFalse(lamp.isTurnOn())

            );
        }

    }

    @Nested
    @DisplayName("Mètode encendre la làmpara")
    class TurnOn {

        @BeforeEach
        void setUp() {
            lamp = new Lamp(10.5, true);
        }

        @Test
        @DisplayName("El mètode turnOn existix")
        void turnOnExistix() {
            lamp.turnOn();
        }

        @Test
        @DisplayName("El mètode turnOn torna true el lamp")
        void turnOnReturnsTrue() {
            lamp.turnOn();
            boolean result = lamp.isTurnOn();
            assertTrue(result);
        }

    }

    @Nested
    @DisplayName("Mètode apagar la làmpara")
    class TurnOff {

        @BeforeEach
        void setUp() {
            lamp = new Lamp(10.5, true);
        }

        @Test
        @DisplayName("El mètode turnOff existix")
        void turnOffExistix() {
            lamp.turnOff();
        }

        @Test
        @DisplayName("El mètode turnOff torna false el lamp")
        void turnOnReturnsFalse() {
            lamp.turnOff();
            boolean result = lamp.isTurnOn();
            assertFalse(result);
        }
    }

    @Nested
    @DisplayName("Mètode toggle")
    class Toggle {

        @BeforeEach
        void setUp() {
            lamp = new Lamp(10.5, true);
        }

//        @Test
//        @DisplayName("El mètode toggle existix")
//        void toggleExistix() {
//            lamp.toggle(false);
//        }

        @Test
        @DisplayName("El mètode toggle torna True si rep un False")
        void toggleAcceptsFalseReturnsTrue() {
            lamp.setTurnOn(true);
            lamp.toggle();
            assertFalse(lamp.isTurnOn());
        }

        @Test
        @DisplayName("El mètode toggle torna False si rep un True")
        void toggleAcceptsTrueReturnsFalse() {
            lamp.setTurnOn(false);
            lamp.toggle();
            assertTrue(lamp.isTurnOn());
        }

    }

    @Nested
    @DisplayName("Mètode càlcul de consum")
    class Consum {

        @BeforeEach
        void setUp() {
            lamp = new Lamp(10.5, true);
        }

        @Test
        @DisplayName("Mètode consumption existix")
        void consumptionExists() {
            lamp.consumption(60);
        }

        @Test
        @DisplayName("Mètode consumption retorna un double")
        void consumptionIsDouble() {
            double result = lamp.consumption(60);
        }

        @Test
        @DisplayName("Mètode consumption accepta el paràmetre 'segons' con un double")
        void consumptionIsDoubleAndReceivesDouble() {
            double result = lamp.consumption(60.5);
        }

        @Test
        @DisplayName("Si la làmpara està apagada, retorna 0")
        void lampOffReturns0() {
            lamp.turnOn = false;
            double result = lamp.consumption(60.5);

            assertEquals(0, result);
        }

        @Test
        @DisplayName("Si la làmpara està encesa 0 segons, retorna 0")
        void lampOn0SecsReturns0() {
            lamp.turnOn = true;
            double result = lamp.consumption(0);

            assertEquals(0, result);
        }


//        @Test
//        @DisplayName("Si està encesa, retorna el càlcul del consum")
//        void lampOffReturnsOffbbb() {
//            lamp.turnOn = true;
//            double result = lamp.consumption(10000);
//            lamp.setConsumption(100);
//
//            assertEquals(277.78, result);
//        }

        @ParameterizedTest
        @CsvSource({ "100,10000,277.77778", "100,15000,416.66667", "75,18000,375", "50,50000,694.44444" })
        void consumptionReturnsTheRightMath(double left, double right, double expected) {
            lamp.setConsumption(left);
            double result = lamp.consumption(right);
            assertEquals(expected, result, 0.1);
        }

    }
}
