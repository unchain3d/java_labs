package ua.lviv.iot.algo.part1.lab1.model;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public abstract class Game {
    protected String publisher;
    protected LocalDate releaseDate;
    protected List<Player> currentPlayers;

    public void connectPlayer(Player player) {
        currentPlayers.add(player);
    }

    public void disconnectPlayer(int index) {
        currentPlayers.remove(index);
    }
}

