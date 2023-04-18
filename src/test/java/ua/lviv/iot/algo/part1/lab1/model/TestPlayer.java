package ua.lviv.iot.algo.part1.lab1.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

@Getter
@Setter
@NoArgsConstructor
public class TestPlayer {
    @Test
    public void testConstructors() {
        Player player = new Player("Orest", "Clown", 16);
        assertEquals("Orest", player.getName());
        assertEquals("Clown", player.getNickname());
        assertEquals(16, player.getAge());
    }
}
