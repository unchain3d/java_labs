package ua.lviv.iot.algo.part1.lab1.model;

import lombok.*;

import java.util.LinkedList;
import java.util.List;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString

public class BoardGame {
    private String title;
    private int minPlayers;
    private int maxPlayers;
    private List<Player> currentPlayers;

    private static BoardGame instance; // Singleton

    public static BoardGame getInstance() {
        if (instance == null) {
            instance = new BoardGame("Static Game", 0, 0, new LinkedList<>());
        }
        return instance;
    }

    public void addPlayer(Player player) {
        currentPlayers.add(player);
    }

    public void removePlayer(int index) {
        currentPlayers.remove(index);
    }

    public boolean canPlay() {
        int size = currentPlayers.size();
        return size >= minPlayers && size <= maxPlayers;
    }

    @Override
    public String toString() {
        return "title: " + title + "\n" +
                "minPlayers: " + minPlayers + "\n" +
                "maxPlayers: " + maxPlayers + "\n" +
                "currentPlayers: " + currentPlayers.size() + "\n" +
                "canPlay: " + canPlay() + "\n";
    }
}
