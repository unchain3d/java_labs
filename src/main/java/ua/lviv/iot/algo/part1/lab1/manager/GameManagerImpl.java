package ua.lviv.iot.algo.part1.lab1.manager;

import lombok.*;
import ua.lviv.iot.algo.part1.lab1.model.Game;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
@ToString
@AllArgsConstructor
public class GameManagerImpl implements GameManager {
    private List<Game> games;

    @Override
    public void addGame(Game game) {
        games.add(game);
    }

    @Override
    public List<Game> findAllWithReleaseDateLaterThan(LocalDate date) {
        return games.stream()
                .filter(game -> game.getReleaseDate().isAfter(date))
                .collect(Collectors.toList());
    }

    @Override
    public List<Game> findAllWithPublisher(String publisher) {
        Stream<Game> gameStream = games.stream()
                .filter(game -> game.getPublisher().equals(publisher));
        return gameStream
                .collect(Collectors.toList());
    }

    @Override
    public void showGames() {
        for (Game game : games) {
            System.out.println(game);
        }
    }
}

