import org.example.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

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

        @Test
        @DisplayName("Deposit dona true quan el depòsit es major a 0")
        void depositAcceptsGreaterThan0() {
            boolean expected = bankAccount.deposit(100);

            assertTrue(expected);
        }

        @Test
        @DisplayName("El balanç augmenta la quantitat assignada")
        void depositIncreases100() {
            bankAccount.deposit(100);

            assertEquals(200, bankAccount.getBalance());
        }

        @Test
        @DisplayName("El balanç augmenta la quantitat assignada més d'una vegada")
        void depositIncreases2Times() {
            bankAccount.deposit(100);
            bankAccount.deposit(300);

            assertEquals(500, bankAccount.getBalance());
        }
    }
}
