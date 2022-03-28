package ru.netology.tournament;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    private Game player = new Game();

    private Player player1 = new Player(1, "Ivan", 10);
    private Player player2 = new Player(2, "Andrey", 15);
    private Player player3 = new Player(3, "Denis", 34);
    private Player player4 = new Player(4, "Oleg", 25);
    private Player player5 = new Player(5, "Ilya", 24);
    private Player player6 = new Player(6, "Vasily", 19);
    private Player player7 = new Player(7, "Petr", 34);
    private Player player8 = new Player(8, "Evgeny", 39);

    @BeforeEach
    void setUp() {
        player.register(player1);
        player.register(player2);
        player.register(player3);
        player.register(player4);
        player.register(player5);
        player.register(player6);
        player.register(player7);
    }

    @Test
    void shouldThrowAnExceptionIfNotRegistered() {
        assertThrows(NotRegisteredException.class, () -> player.round(player1.getName(), player8.getName()));
    }

    @Test
    void shouldThrowAnExceptionIfNotRegistered1() {
        assertThrows(NotRegisteredException.class, () -> player.round(player8.getName(), player6.getName()));
    }

    @Test
    void round() {
        int expected = 0;
        int actual = player.round(player3.getName(), player7.getName());
        assertEquals(expected, actual);

    }

    @Test
    void round1() {
        int expected = 1;
        int actual = player.round(player5.getName(), player1.getName());
        assertEquals(expected, actual);

    }

    @Test
    void round2() {
        int expected = 2;
        int actual = player.round(player6.getName(), player4.getName());
        assertEquals(expected, actual);

    }
}