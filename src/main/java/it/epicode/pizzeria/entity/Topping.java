package it.epicode.pizzeria.entity;

import lombok.Data;

@Data
public class Topping {
    private String name;
    private double calories;
    private double price;

    public Topping(String name, double calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }
}