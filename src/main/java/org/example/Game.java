package org.example;

import java.time.LocalDateTime;
import java.util.Date;

class Game {
    //Classic values
    private String title;
    private PlayerBuiding playerBuiding[];
    private LocalDateTime currentDate;
    private LocalDateTime beginDate;

    public Game(String title, LocalDateTime beginDate, int gold, int wood, int stone, int food, int steel) {
        this.title = title;
        this.currentDate = LocalDateTime.now();
        this.beginDate = beginDate;
        this.gold = gold;
        this.wood = wood;
        this.stone = stone;
        this.food = food;
        this.steel = steel;
    }

    //Ressources
    private int gold;
    private int wood;
    private int stone;
    private int food;
    private int steel;

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        System.out.println("coucou gold");
        this.gold = gold;
    }

    public int getWood() {
        return wood;
    }

    public void setWood(int wood) {
        System.out.println("coucou wood");
        this.wood = wood;
    }

    public int getStone() {
        return stone;
    }

    public void setStone(int stone) {
        System.out.println("coucou stone");
        this.stone = stone;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        System.out.println("coucou food");
        this.food = food;
    }

    public int getSteel() {
        return steel;
    }

    public void setSteel(int steel) {
        System.out.println("coucou steel");
        this.steel = steel;
    }
}
