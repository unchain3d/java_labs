package ua.lviv.iot.algo.part1.lab1.manager;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.manager.GameManager;
import ua.lviv.iot.algo.part1.lab1.manager.GameManagerImpl;
import ua.lviv.iot.algo.part1.lab1.model.BoardGame;
import ua.lviv.iot.algo.part1.lab1.model.Game;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGameManagerImpl {
    @Test
    public void testAddGame() {
        GameManagerImpl games = new GameManagerImpl(new ArrayList<>());
        games.addGame(new BoardGame());
        assertEquals(1, games.getGames().size());
        games.addGame(new BoardGame());
        assertEquals(2, games.getGames().size());
    }

    @Test
    public void testFindAllWithReleaseDateLaterThan() {
        GameManagerImpl games = new GameManagerImpl(new ArrayList<>());
        games.findAllWithReleaseDateLaterThan(LocalDate.now());
        assertEquals(0, games.findAllWithReleaseDateLaterThan(LocalDate.now()).size());
    }

    @Test
    public void testFindAllWithPublisher() {
        GameManagerImpl games = new GameManagerImpl(new ArrayList<>());
        games.findAllWithPublisher("Tvar");
        assertEquals(0, games.findAllWithPublisher("Tvar").size());
    }

    @Test
    public void testShowGames() {
        GameManagerImpl games = new GameManagerImpl(new ArrayList<>());
        Game bait = new BoardGame();
        games.addGame(bait);
        games.showGames();
    }
}

