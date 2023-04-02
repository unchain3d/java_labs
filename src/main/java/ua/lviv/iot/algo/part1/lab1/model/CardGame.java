package ua.lviv.iot.algo.part1.lab1.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@ToString

public class CardGame extends Game {
    private int quantityOfCards;

    public CardGame(String publisher, LocalDate releaseDate, List<Player> currentPlayers, int quantityOfCards) {
        super(publisher, releaseDate, currentPlayers);
        this.quantityOfCards = quantityOfCards;
    }
}
