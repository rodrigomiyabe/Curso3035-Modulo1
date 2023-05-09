package com.example.game.Classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Fighter {

    private String name;
    private Double power;
    private Double life;
    private Special specialAttack;

    public abstract void takeLife(Fighter fighter);
    public abstract void normalAttack(Fighter fighter);
    public abstract void specialAttack(Fighter fighter);

}
