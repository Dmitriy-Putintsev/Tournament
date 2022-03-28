package ru.netology.tournament;

import java.util.ArrayList;
import java.util.List;

public class Game {
    //-------создание списка----------
    private List<Player> players = new ArrayList<>();

    //-----------регистрируем игрока------------
    public void register(Player player) {
        this.players.add(player);
    }

    //------------ищем игрока по имени---------
    private Player findPlayer(String name) {
        for (Player player : players) {
            if (player.getName() == name) {
                return player;
            }
        }
        return null;
    }

    //------------ параметры метода соревнования---------
    public int round(String playerName1, String playerName2) {
        Player player1 = findPlayer(playerName1);
        Player player2 = findPlayer(playerName2);

        if (player1 == null || player2 == null) {
            throw new NotRegisteredException();
        }
        int winner = player1.getStrength() - player2.getStrength();
        if (winner < 0) {
            return 2;
        }
        if (winner > 0) {
            return 1;
        }

        return 0;
    }

}
