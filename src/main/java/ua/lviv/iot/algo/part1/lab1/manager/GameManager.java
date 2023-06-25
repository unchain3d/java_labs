package ua.lviv.iot.algo.part1.lab1.manager;

import ua.lviv.iot.algo.part1.lab1.model.Game;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;



public interface GameManager {
    void addGame(Game game);

    List<Game> findAllWithReleaseDateLaterThan(LocalDate date);

    List<Game> findAllWithPublisher(String publisher);

    void showGames();

}
