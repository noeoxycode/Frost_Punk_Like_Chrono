package org.example;

public abstract class Building {
    //CLASSIC PROPERTIES
    private String title;
    private String img;
    private int level;

    //COST
    private int goldCost;
    private int woodCost;
    private int stoneCost;
    private int foodCost;
    private int steelCost;

    public Building(String title, String img, int level, int goldCost, int woodCost, int stoneCost, int foodCost, int steelCost) {
        this.title = title;
        this.img = img;
        this.level = level;
        this.goldCost = goldCost;
        this.woodCost = woodCost;
        this.stoneCost = stoneCost;
        this.foodCost = foodCost;
        this.steelCost = steelCost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getGoldCost() {
        return goldCost;
    }

    public void setGoldCost(int goldCost) {
        this.goldCost = goldCost;
    }

    public int getWoodCost() {
        return woodCost;
    }

    public void setWoodCost(int woodCost) {
        this.woodCost = woodCost;
    }

    public int getStoneCost() {
        return stoneCost;
    }

    public void setStoneCost(int stoneCost) {
        this.stoneCost = stoneCost;
    }

    public int getFoodCost() {
        return foodCost;
    }

    public void setFoodCost(int foodCost) {
        this.foodCost = foodCost;
    }

    public int getSteelCost() {
        return steelCost;
    }

    public void setSteelCost(int steelCost) {
        this.steelCost = steelCost;
    }
}
