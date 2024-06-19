import org.example.Car;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Nested
    @DisplayName("Accelerate tests")
    class Accelerate {
        private Car car;

        @BeforeEach
        void setup() {
            car = new Car("0000 BBB");
        }

        @Test
        @DisplayName("Comprova la velocitat inicial")
        void testInitialVelocity() {
            assertEquals(0, car.getVelocity());
        }

        @Test
        @DisplayName("Accelera una única vegada")
        void singleAccelerate() {
            car.accelerate();
            assertEquals(5, car.getVelocity());
        }

        @Test
        @DisplayName("Accelera multiple vegades")
        void multipleAccelerate() {
            car.accelerate();
            car.accelerate();
            car.accelerate();
            assertEquals(15, car.getVelocity());
        }

        @Test
        @DisplayName("Accelera una velocitat determinada")
        void specificAccelerate() {
            car.accelerate(13);
            car.accelerate(14);
            assertEquals(27, car.getVelocity());
        }
    }
}