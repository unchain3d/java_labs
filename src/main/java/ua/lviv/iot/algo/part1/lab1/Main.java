package ua.lviv.iot.algo.part1.lab1;

import ua.lviv.iot.algo.part1.lab1.model.BoardGame;
import ua.lviv.iot.algo.part1.lab1.model.Player;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BoardGame chess = new BoardGame();
        BoardGame monopoly = new BoardGame("Monopoly", 2, 5, new LinkedList<>());

        monopoly.addPlayer(new Player("Ivan", "Iv4n", 14));
        monopoly.addPlayer(new Player("Daniel", "xXx", 20));

        List<BoardGame> games = new LinkedList<>();
        games.add(chess);
        games.add(monopoly);
        games.add(BoardGame.getInstance());
        games.add(BoardGame.getInstance());

        for (int i = 0; i < games.size(); i++) {
            System.out.println(games.get(i));
        }
    }
}

