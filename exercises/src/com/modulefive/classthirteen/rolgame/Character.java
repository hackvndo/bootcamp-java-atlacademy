package com.modulefive.classthirteen.rolgame;

public abstract class Character {
    protected String name;
    protected int level;
    protected int life;

    protected int hit = 5;

    public Character(String name, int level, int life) {
        this.name = name;
        this.level = level;
        this.life = life;
    }

    public abstract int attack();

    public abstract int damageReceived(int damage);

    public abstract int autoHealth();


}
