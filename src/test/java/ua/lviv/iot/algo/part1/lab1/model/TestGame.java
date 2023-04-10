package ua.lviv.iot.algo.part1.lab1.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;


public class TestGame {
    @Test
    public void testConnectPlayer() {
        Game game = new BoardGame("Monopoly", LocalDate.of(2002, Month.APRIL, 2),
                new LinkedList<>(), "S", 2, 5);
        game.connectPlayer(new Player());
        Assertions.assertEquals(1, game.getCurrentPlayers().size());
    }

    @Test
    public void testDisconnectPlayer() {
        Game game = new BoardGame("Monopoly", LocalDate.of(2002, Month.APRIL, 2),
                new LinkedList<>(), "S", 2, 5);
        game.connectPlayer(new Player("Ivan", "Iv4n", 14));
        game.disconnectPlayer(0);
        Assertions.assertEquals(0, game.getCurrentPlayers().size());
    }
}
