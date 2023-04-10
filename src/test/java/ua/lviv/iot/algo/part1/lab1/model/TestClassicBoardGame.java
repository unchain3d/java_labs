package ua.lviv.iot.algo.part1.lab1.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class TestClassicBoardGame {
    @Test
    public void testConnectPlayer() {
        ClassicBoardGame game = new ClassicBoardGame("Sweets", LocalDate.of(2002, Month.APRIL, 2),
                new ArrayList<>(), "Somewhat", 2, 5, "X");
        game.connectPlayer(new Player());
        Assertions.assertEquals(1, game.getCurrentPlayers().size());
    }

    @Test
    public void testDisconnectPlayer() {
        ClassicBoardGame game = new ClassicBoardGame("Sweets", LocalDate.of(2002, Month.APRIL, 2),
                new ArrayList<>(), "Somewhat", 2, 5, "X");
        game.connectPlayer(new Player("Ivan", "Iv4n", 14));
        game.disconnectPlayer(0);
        Assertions.assertEquals(0, game.getCurrentPlayers().size());
    }
}
