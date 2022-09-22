package org.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ProductorBuilding extends Building {
    //WORKER
    private int workersNeeded;
    private int workersAssigned;
    private Ressources ressource;
    private int productionSpeed;

    public int getWorkersNeeded() {
        return workersNeeded;
    }

    public void setWorkersNeeded(int workersNeeded) {
        this.workersNeeded = workersNeeded;
    }

    public int getWorkersAssigned() {
        return workersAssigned;
    }

    public void setWorkersAssigned(int workersAssigned) {
        this.workersAssigned = workersAssigned;
    }

    public ProductorBuilding(String title, String imgLink, int level, int goldCost, int woodCost, int stoneCost,
                             int foodCost, int steelCost, int workersNeeded, int workersAssigned,
                             Ressources ressource, int productionSpeed) {
        super(title, imgLink, level, goldCost, woodCost, stoneCost, foodCost, steelCost);
        this.workersNeeded = workersNeeded;
        this.workersAssigned = workersAssigned;
        this.ressource = ressource;
        this.productionSpeed = productionSpeed;
    }

    public Ressources getRessource() {
        return ressource;
    }

    public void setRessource(Ressources ressource) {
        this.ressource = ressource;
    }

    public int getProductionSpeed() {
        return productionSpeed;
    }

    public void setProductionSpeed(int productionSpeed) {
        this.productionSpeed = productionSpeed;
    }

    public int producingRessource() {
        int production = 0;
        switch(this.getRessource()){
            case Gold:
                System.out.println("Bonjour");
                production = this.getProductionSpeed() * (this.getWorkersAssigned() / this.getWorkersNeeded());
                System.out.println("production : " + production);
                break;

            case Wood:
                System.out.println("Hello");
                break;

            case Stone:
                System.out.println("Buenos dias");
                break;

            case Food:
                System.out.println("Buenos dias");
                break;

            case Steel:
                System.out.println("Buenos dias");
                break;
            default:
                System.out.println("Choix incorrect");
                break;
        }
        return production;
    }
}
