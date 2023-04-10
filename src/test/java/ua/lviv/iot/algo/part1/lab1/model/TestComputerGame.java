package ua.lviv.iot.algo.part1.lab1.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.LinkedList;

public class TestComputerGame {
    @Test
    public void testConnectPlayer() {
        ComputerGame game = new ComputerGame("Corn", LocalDate.of(2002, Month.APRIL, 2), new LinkedList<>());
        game.connectPlayer(new Player());
        Assertions.assertEquals(1, game.getCurrentPlayers().size());
    }

    @Test
    public void testDisconnectPlayer() {
        ComputerGame game = new ComputerGame("Corn", LocalDate.of(2002, Month.APRIL, 2), new ArrayList<>());
        game.connectPlayer(new Player("Ivan", "Iv4n", 14));
        game.disconnectPlayer(0);
        Assertions.assertEquals(0, game.getCurrentPlayers().size());
    }

}
