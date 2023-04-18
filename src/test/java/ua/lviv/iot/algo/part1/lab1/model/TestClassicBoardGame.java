package ua.lviv.iot.algo.part1.lab1.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@Getter
@Setter
@NoArgsConstructor

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
    @Test
    public void testCanPlay() {
        ClassicBoardGame game1 = new ClassicBoardGame("Who", LocalDate.of(2001, Month.APRIL, 2),
                new ArrayList<>(), "Why", 2, 6, "TENNY");
        boolean result = game1.canPlay();
        assertFalse(result);
    }
    @Test
    public void testConstructors() {
        ClassicBoardGame game2 = new ClassicBoardGame("Nothing", LocalDate.of(2002, Month.APRIL, 2),
                new ArrayList<>(), "Somewhat", 2, 5, "forWhat");
        assertEquals("Nothing", game2.getTitle());
        assertEquals(LocalDate.of(2002, Month.APRIL, 2), game2.getReleaseDate());
        assertEquals(0, game2.getCurrentPlayers().size());
        assertEquals("Somewhat", game2.getPublisher());
        assertEquals(2, game2.getMinPlayers());
        assertEquals(5, game2.getMaxPlayers());
        assertEquals("forWhat", game2.getName());
    }
}
