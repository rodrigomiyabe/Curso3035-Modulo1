package com.example.game.Personagens;


import com.example.game.Classes.Fighter;
import com.example.game.Classes.Special;

public class Guile extends Fighter {

    public Guile(String name, Double power, Double life, Special specialAttack) {
        super(name, power, life, specialAttack);
    }

    @Override
    public void takeLife(Fighter fighter) {
        if(this.getLife() > 0){
            if(fighter.getSpecialAttack().getName().equals("Ground Shave Rolling ")){
                this.setLife(fighter.getSpecialAttack().getValueSpecial());
            }
            else {
                this.setLife(this.getLife() - fighter.getPower());
            }
        }else
            System.out.println("Vida zerada!");
    }

    @Override
    public void normalAttack(Fighter fighter) {
        fighter.setLife(fighter.getLife() - this.getPower());
    }

    @Override
    public void specialAttack(Fighter fighter) {
        fighter.setLife(fighter.getLife() - this.getSpecialAttack().getValueSpecial());
    }
}
