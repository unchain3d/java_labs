package ua.lviv.iot.algo.part1.lab1;

import ua.lviv.iot.algo.part1.lab1.manager.GameManager;
import ua.lviv.iot.algo.part1.lab1.manager.GameManagerImpl;
import ua.lviv.iot.algo.part1.lab1.model.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BoardGame chess = new BoardGame("Chess", LocalDate.of(2002, Month.APRIL, 2),
                new LinkedList<>(), "A", 2, 5);
        BoardGame monopoly = new BoardGame("Monopoly", LocalDate.of(2002, Month.APRIL, 2),
                new LinkedList<>(), "S", 2, 5);
//        CardGame durak = new CardGame();
//        CardGame kosynka = new CardGame();
//        ClassicBoardGame powerGrid = new ClassicBoardGame();
//        ClassicBoardGame go = new ClassicBoardGame();

        monopoly.connectPlayer(new Player("Ivan", "Iv4n", 14));
        monopoly.connectPlayer(new Player("Daniel", "xXx", 20));

        GameManager manager = new GameManagerImpl(new LinkedList<>());
        manager.addGame(chess);
        manager.addGame(monopoly);

        List<Game> filtered = manager.findAllWithPublisher("S");
        System.out.println("Publisher S:");
        for (Game game : filtered) {
            System.out.println(game);
        }

        System.out.println();
        System.out.println("Year 2000:");
        manager.findAllWithReleaseDateLaterThan(LocalDate.of(2000, 1, 1));

        System.out.println();
        System.out.println("All:");
        manager.showGames();
    }
}

