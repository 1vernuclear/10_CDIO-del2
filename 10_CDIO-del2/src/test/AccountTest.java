package test;

import Spil.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account acct = new Account(1000);

    @Test
    void addToBalance() {
        assertEquals(1500, acct.addToBalance(500), 0.1);
    }

    @Test
    void subtractFromBalance() {
        acct.subtractFromBalance(500);
        assertEquals(500, acct.getBalance(), 0.1);

        acct.subtractFromBalance(2000);
        assertEquals(0, acct.getBalance(), 0.1);
    }
}