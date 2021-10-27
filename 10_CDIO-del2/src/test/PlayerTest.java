package test;

import Spil.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    Player player1 = new Player("John", 1000);

    @Test
    void updateScore() {
        player1.updateScore(500);
        assertEquals(1500, player1.getBalance(), 0.1);

        player1.updateScore(-500);
        assertEquals(1000, player1.getBalance(), 0.1);

        player1.updateScore(-5000);
        assertEquals(0, player1.getBalance(), 0.1);
    }
}