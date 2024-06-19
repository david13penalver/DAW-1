import org.example.BankingData;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankingDataTest {

    @Test
    @DisplayName("BankAccount exists")
    void bankAccountExists() {
        BankingData bankingData = new BankingData();
    }

    @Nested
    @DisplayName("Constructors")
    public class Constructors {

        @Test
        @DisplayName("Constructor amb 2 arguments")
        void constructor2Arguments() {
            BankingData bankingData = new BankingData(1, "David");
        }

        @Test
        @DisplayName("Constructor amb 3 arguments")
        void constructor3Arguments() {
            BankingData bankingData = new BankingData(1, "David", 100.00);
        }
    }

    @Nested
    @DisplayName("Test de depòsit")
    public class Deposit {
        BankingData bankingData =  new BankingData(1, "David", 100.00);

        @BeforeEach
        void setUp() {

        }

        @Test
        @DisplayName("Mètode boolean depòsit existix")
        void deposit() {
            boolean expected = true;
            boolean result = bankingData.deposit(100);

            assertEquals(expected, result);
        }

        @Test
        @DisplayName("Mètode boolean depòsit accepta ingrés de diners")
        void deposit100() {
            boolean expected = true;
            boolean result = bankingData.deposit(100);

            assertEquals(expected, result);
        }

        @Test
        @DisplayName("Mètode boolean depòsit no accepta 0")
        void deposit0() {
            boolean expected = false;
            boolean result = bankingData.deposit(0);

            assertEquals(expected, result);
        }

        @Test
        @DisplayName("Mètode boolean depòsit no accepta 0 o menys")
        void depositNegatiu() {
            boolean expected = false;
            boolean result = bankingData.deposit(-100);

            assertEquals(expected, result);
        }

        @Test
        @DisplayName("Mètode boolean depòsit augmenta en 100 els 100 inicials")
        void deposit100A100InicialsTorna200() {
            double expected = 200;

            bankingData.deposit(100);
            double result = bankingData.getBalance();
            assertEquals(expected, result);
        }

        @Test
        @DisplayName("Mètode boolean depòsit augmenta en 200 els 100 inicials")
        void deposit200A100InicialsTorna300() {
            double expected = 300;

            bankingData.deposit(200);
            double result = bankingData.getBalance();
            assertEquals(expected, result);
        }
    }

    @Nested
    @DisplayName("Test de retirada de diners")
    public class Withdraw {
        BankingData bankingData =  new BankingData(1, "David", 100.00);

//        @Test
//        @DisplayName("El mètode boolean Withdraw existix")
//        void withdrawExists() {
//            bankingData.withdraw();
//        } Conflicte al ficar quantitat, ja no és necessari

        @Test
        @DisplayName("El mètode Withdraw accepta diners")
        void withdrawAdmitsMoney() {
            bankingData.withdraw(10);
        }

        @Test
        @DisplayName("El mètode Withdraw no accepta 0")
        void withdrawNoAdmitsMoney0() {
            boolean expected = false;
            boolean resultat = bankingData.withdraw(0);

            assertEquals(expected, resultat);
        }

        @Test
        @DisplayName("El mètode Withdraw no accepta negatiu")
        void withdrawNoAdmitsMoneyNegative() {
            boolean expected = false;
            boolean resultat = bankingData.withdraw(-10);

            assertEquals(expected, resultat);
        }

        @Test
        @DisplayName("El mètode Withdraw resta 10€ als 100 previs")
        void withdraw10Returns90() {
            bankingData.withdraw(10);

            double expected = 90;
            double resultat = bankingData.getBalance();

            assertEquals(expected, resultat);
        }
    }
}
