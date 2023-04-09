package ua.lviv.iot.algo.part1.lab1.model;

import java.util.List;

public class ComputerGame {
    private int freeDiskSpace;
    private String genre;
    private double metacriticScore;
    private List<Player> numberOfPlayers;

    private void connectPlayer(Player player) {
        numberOfPlayers.add(player);
    }

    private void disconnectPlayer(int index) {
        numberOfPlayers.remove(index);
    }

}
