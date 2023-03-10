package ua.lviv.iot.algo.part1.lab1.model;

import java.util.LinkedList;
import java.util.List;

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

    public BoardGame() {
        this(null, 5, 10, new LinkedList<>());
    }

    public BoardGame(String title, int minPlayers, int maxPlayers, List<Player> players) {
        this.title = title;
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
        this.currentPlayers = players;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public void setMinPlayers(int minPlayers) {
        this.minPlayers = minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public List<Player> getCurrentPlayers() {
        return currentPlayers;
    }

    public void setCurrentPlayers(List<Player> currentPlayers) {
        this.currentPlayers = currentPlayers;
    }
}
