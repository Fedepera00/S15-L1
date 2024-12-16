package it.epicode.pizzeria.entity;

import lombok.Data;

@Data
public class Pizza {
    private String name;
    private String description;
    private double calories;
    private double price;

    public Pizza(String name, String description, double calories, double price) {
        this.name = name;
        this.description = description;
        this.calories = calories;
        this.price = price;
    }
}