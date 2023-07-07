package com.modulefive.classthirteen.rolgame;

public class Wizard extends Character {

    private int magicSpell;
    protected int magicPower = 12;

    public Wizard(String name, int level, int life, int magicSpell) {
        super(name, level, life);
        this.magicSpell = magicSpell;
    }

    @Override
    public int attack() {
        System.out.println("Evil Spirit! Attacks with: " + magicPower);
        return magicPower;
    }

    @Override
    public int damageReceived(int damage) {
        System.out.println(name + " receives " + damage + " damage");
        life -= damage;
        return life;
    }

    @Override
    public int autoHealth() {
        int healthRecovered = level * 3;
        System.out.println(name + " recovers " + healthRecovered + " health");
        life += healthRecovered;
        return life;
    }

    public int specialAbility() {
        System.out.println(name + " *** use Special Ability!: Magic Spell!");
        System.out.println("Hide, fast! ***");
        level *= 3;
        return magicPower * magicSpell * level;

    }

}
