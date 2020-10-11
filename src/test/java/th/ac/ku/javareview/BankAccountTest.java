package th.ac.ku.javareview;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    BankAccount account;

    @BeforeEach
    void setup() {
        System.out.println(".....setting up.....");
        account = new BankAccount(100);
    }

    @Test
    void testDepositOnce() {
        account.deposit(20);

        // actually this tests 2 methods (deposit and getBalance)
        assertEquals(120, account.getBalance());
    }

    @Test
    void testDepositTwice() {
        account.deposit(20);
        account.deposit(30);
        assertEquals(150, account.getBalance());
    }

    @Test
    void testWithdrawLessThanBalance() {
        account.withdraw(20);
        assertEquals(80, account.getBalance());
    }

    @Test
    void testWithdrawMoreThanBalance() {
        Exception e = assertThrows(IllegalArgumentException.class, new Executable() {
            // anonymous class by IntelliJ
            @Override
            public void execute() throws Throwable {
                account.withdraw(500);
            }
        });

        assertEquals("Cannot withdraw more than balance", e.getMessage());
    }

    @AfterEach
    void teardown() {
        System.out.println(".....cleaning up.....");
    }
}
