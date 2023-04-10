package ua.lviv.iot.algo.part1.lab1.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Getter
@NoArgsConstructor
@ToString
public class ClassicBoardGame extends BoardGame {
    private String name;

    public ClassicBoardGame(String title, LocalDate releaseDate, List<Player> currentPlayers, String publisher,
                            int minPlayers, int maxPlayers, String name) {
        super(title, releaseDate, currentPlayers, publisher, minPlayers, maxPlayers);
        this.name = name;
    }
}
