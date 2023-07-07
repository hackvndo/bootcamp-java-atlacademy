package com.modulefive.classthirteen.rolgame;

public class Knight extends Character {

    private int mortalCut;

    protected int strenght = 10;

    public Knight(String name, int level, int life, int mortalCut) {
        super(name, level, life);
        this.mortalCut = mortalCut;
    }

    @Override
    public int attack() {
        System.out.println("Ice Sword! Attacks with " + strenght);
        return strenght;
    }

    @Override
    public int damageReceived(int damage) {
        System.out.println(name + " receives " + damage + " damage");
        life -= damage;
        return life;
    }

    @Override
    public int autoHealth() {
        int healthRecovered = level * 2;
        System.out.println(name + " recovers " + healthRecovered + " health");
        life += healthRecovered;
        return life;
    }

    public int specialAbility() {
        System.out.println(name + " *** use Special Ability!: Mortal Cut!");
        System.out.println("Run for your life! ***");
        level *= 3;
        return strenght *  mortalCut * level;
    }
}
