package ua.lviv.iot.algo.part1.lab1.model;

import java.time.LocalDate;
import java.util.List;

public class ComputerGame extends Game {
    private int freeDiskSpace;
    private String genre;
    private double metacriticScore;

    public ComputerGame(String publisher, LocalDate releaseDate, List<Player> currentPlayers) {
        super(publisher, releaseDate, currentPlayers);
    }
}
