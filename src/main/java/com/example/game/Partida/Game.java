package com.example.game.Partida;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Game {
    private Player p1;
    private Player p2;

    public Player startMatch (Player p1, Player p2){

        while (p1.getCharacter().getLife() > 0 || p2.getCharacter().getLife() > 0){
            if(p2.getCharacter().getLife() > p1.getCharacter().getPower() && p1.getCharacter().getLife() > p2.getCharacter().getPower()) {
                p1.getCharacter().takeLife(p2.getCharacter());
                System.out.println( " p2 vida: " + p2.getCharacter().getLife());
                p2.getCharacter().takeLife(p1.getCharacter());
                System.out.println(" p1 vida " + p1.getCharacter().getLife());
            } else if (p2.getCharacter().getLife() < p1.getCharacter().getPower()) {
                System.out.println(p2.getCharacter());
                p2.getCharacter().setLife(0.0);

                break;
            }
            else {
                p1.getCharacter().setLife(0.0);
                break;
            }

        }
        if(p1.getCharacter().getLife() <= 0){
            //print o player vencedor e o perdedor juntamente com o nome do seu personagem e o valor restante de vida.
            System.out.println("Winner: " + p2.getName() + " Loser: " + p1.getName() + ". " + p2.getCharacter().getName() +" ganhou de " + p1.getCharacter().getName() + ". Vida restante: " + p2.getCharacter().getLife() );
            return p2;
        }else {
            System.out.println("Winner: " + p1.getName() + " Loser: " + p2.getName() + ". " + p1.getCharacter().getName() +" ganhou de " + p2.getCharacter().getName() + ". Vida restante: " + p1.getCharacter().getLife() );
            return p1;
        }
    }

}


