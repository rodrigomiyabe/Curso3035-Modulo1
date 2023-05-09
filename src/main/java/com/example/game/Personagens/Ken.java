package com.example.game.Personagens;


import com.example.game.Classes.Fighter;
import com.example.game.Classes.Special;

public class Ken extends Fighter {

    public Ken(String name, Double power, Double life, Special specialAttack) {
        super(name, power, life, specialAttack);
    }

    @Override
    public void takeLife(Fighter fighter) {
        if(fighter.getLife() > 0 && fighter.getLife() > this.getPower()){
            fighter.setLife(fighter.getLife() - getPower());
        }
        else {
            fighter.setLife(0.0);
            System.out.println("Vida zerada!");
        }
    }

    //recebe o parametro do ataque
    @Override
    public void normalAttack(Fighter fighter) {
        this.setPower(this.getPower());
    }

    @Override
    public void specialAttack(Fighter fighter) {
        this.setPower(this.getSpecialAttack().getValueSpecial());
    }
}
