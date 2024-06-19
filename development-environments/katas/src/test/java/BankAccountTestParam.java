import org.example.BankAccount;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTestParam {

    @Nested
    @DisplayName("Constructors")
    class Constructors {

        @Test
        @DisplayName("Constructor buit")
        void constructorBuit() {
            BankAccount bankAccoun = new BankAccount();
        }

        @Test
        @DisplayName("Constructor amb 2 argument")
        void constructorAmbCompteINom() {
            BankAccount bankAccount = new BankAccount(13, "David");
        }

        @Test
        @DisplayName("Constructor amb 3 argument")
        void constructorAmbCompteNomIBalance() {
            BankAccount bankAccount = new BankAccount(13, "David", 100);
        }
    }

    @Nested
    @DisplayName("Mètode depòsit")
    class Deposit {

        private BankAccount bankAccount;

        @BeforeEach
        void setUp() {
            bankAccount = new BankAccount(13, "David", 100);
        }

        @Test
        @DisplayName("Deposit existix")
        void depositExists() {
            bankAccount.deposit(100);
        }

        @Test
        @DisplayName("Deposit returns boolean")
        void depositIsBoolean() {
            boolean result = bankAccount.deposit(100);

        }

        @Test
        @DisplayName("Deposit accepta un double")
        void depositAcceptsDouble() {
            boolean result = bankAccount.deposit(100.50);
        }

        @Test
        @DisplayName("Deposit no accepta un depòsit de 0")
        void depositNoAccepts0() {
            boolean expected = bankAccount.deposit(0);

            assertFalse(expected);
        }

        @Test
        @DisplayName("Deposit no accepta un depòsit de <0")
        void depositNoAcceptsLessThan0() {
            boolean expected = bankAccount.deposit(0);

            assertFalse(expected);
        }

        @ParameterizedTest
        @ValueSource(doubles = {100, 200, 300, 400})
        @DisplayName("Deposit dona true quan el depòsit es major a 0")
        void depositAcceptsGreaterThan0(double number) {
            boolean expected = bankAccount.deposit(number);

            assertTrue(expected);
        }

        @ParameterizedTest
        @CsvSource({"150,50", "220,120"})
        @DisplayName("El balanç augmenta la quantitat assignada")
        void depositIncreases100(double expected, double number) {
            bankAccount.deposit(number);

            assertEquals(expected, bankAccount.getBalance());
        }

        @Test
        @DisplayName("El balanç augmenta la quantitat assignada més d'una vegada")
        void depositIncreases2Times() {
            bankAccount.deposit(100);
            bankAccount.deposit(300);

            assertEquals(500, bankAccount.getBalance());
        }
    }

    @Nested
    @DisplayName(("Mètode transfer"))
    class Transfer {
        private BankAccount bankAccount;

        @BeforeEach
        void setUp() {
            bankAccount = new BankAccount(13, "David", 100);
        }

        @Test
        @DisplayName("El mètode withdraw existix")
        void withdrawExistix() {
            bankAccount.withdraw(100);
        }

        @Test
        @DisplayName("El mètode withdraw és boolean")
        void withdrawBoolean() {
            boolean result = bankAccount.withdraw(100);
        }

        @Test
        @DisplayName("El mètode withdraw accepta un paràmetre double")
        void withdrawAcceptsDouble() {
            boolean result = bankAccount.withdraw(10.50);
        }

        @Test
        @DisplayName("El mètode withdraw resta diners")
        void withdrawRestsMoney() {
            bankAccount.withdraw(10);
            assertEquals(90, bankAccount.getBalance());
        }

        @Test
        @DisplayName("El mètode withdraw resta diners múltiples vegades")
        void withdrawRestsMoneyAgain() {
            bankAccount.withdraw(10);
            bankAccount.withdraw(10);
            assertEquals(80, bankAccount.getBalance());
        }

        @Test
        @DisplayName("El mètode withdraw no accepta 0")
        void withdrawNoAccepts0() {
            assertFalse(bankAccount.withdraw(0));
        }

        @Test
        @DisplayName("El mètode withdraw no accepta negatiu")
        void withdrawNoAcceptsNegative() {
            assertFalse(bankAccount.withdraw(0));
        }

        @Test
        @DisplayName("El mètode withdraw accepta positiu")
        void withdrawAcceptsPositive() {
            assertTrue(bankAccount.withdraw(10));
        }

        @Test
        @DisplayName("El mètode withdraw no retira una quantitat major a la disponible")
        void withdrawNoAcceptsMore() {
            bankAccount.withdraw(110);
            assertAll("bankAccount",
                () -> assertFalse(bankAccount.withdraw(110)),
                () -> assertEquals(100, bankAccount.getBalance())
            );

        }
    }
}
