package ua.lviv.iot.algo.part1.lab1.model;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@NoArgsConstructor
public class BoardGame extends Game {
    private String title;
    private int minPlayers;
    private int maxPlayers;

    public BoardGame(String title, LocalDate releaseDate, List<Player> currentPlayers,
                     String publisher, int minPlayers, int maxPlayers) {
        super(publisher, releaseDate, currentPlayers);
        this.title = title;
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
    }

    public boolean canPlay() {
        int size = currentPlayers.size();
        return size >= minPlayers && size <= maxPlayers;
    }
}
