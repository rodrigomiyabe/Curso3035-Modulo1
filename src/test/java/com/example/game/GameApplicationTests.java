package com.example.game;

import com.example.game.Classes.Special;
import com.example.game.Partida.Game;
import com.example.game.Partida.Player;
import com.example.game.Personagens.Ken;
import com.example.game.Personagens.Ryu;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GameApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void startMatch() {
        Special specialKen = new Special("Hyakuretsu Kyaku", 5.5);
        Special specialRyu = new Special("Hadouken", 5.0);
        Ryu ryu = new Ryu("Ryu", 1.0, 10.0, specialRyu);
        Ken ken = new Ken("Ken", 1.0,10.0,specialKen);
        Player player1 = new Player("player 1",ryu);
        Player player2 = new Player("player 2",ken);
        Game game = new Game(player1,player2);

        game.startMatch(player1,player2);
        assertEquals(player2,game.startMatch(player1,player2));

    }
}
