package oop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class BankAccountTest {
 @Test
    public void testInitialBalance() {
        BankAccount acc = new BankAccount(100.0);
        assertEquals(100.0, acc.getBalance(), 0.001);
    }
    
    @Test
    public void testValidWithdrawal() {
        BankAccount acc = new BankAccount(200.0);
        acc.withdraw(50.0);
        assertEquals(150.0, acc.getBalance(), 0.001);
    }
    
    @Test
    public void testOverdraftProtection() {
        BankAccount acc = new BankAccount(100.0);
        assertThrows(IllegalArgumentException.class, () -> acc.withdraw(150.0));
    }
}
