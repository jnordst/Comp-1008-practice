package org.example;

public class VideoGame {
    private String name;

    private Double cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public VideoGame(String name, Double cost) {
        setName(name);
        setCost(cost);
    }
}
