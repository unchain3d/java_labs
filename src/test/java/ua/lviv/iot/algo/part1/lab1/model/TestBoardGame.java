package ua.lviv.iot.algo.part1.lab1.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestBoardGame {

    @Test
    public void testCanPlayWhenEmptyPlayers() {
        BoardGame game = new BoardGame("Monopoly", LocalDate.of(2002, Month.APRIL, 2),
                new LinkedList<>(), "S", 2, 5);
        boolean result = game.canPlay();
        assertFalse(result);
    }

    @Test
    public void testConstructors() {
        BoardGame game = new BoardGame("Monopoly", LocalDate.of(2002, Month.APRIL, 2),
                new LinkedList<>(), "S", 2, 5);
        assertEquals("Monopoly", game.getTitle());
        assertEquals(LocalDate.of(2002, Month.APRIL, 2), game.getReleaseDate());
        assertEquals(0, game.getCurrentPlayers().size());
        assertEquals("S", game.getPublisher());
        assertEquals(2, game.getMinPlayers());
        assertEquals(5, game.getMaxPlayers());
    }

}

