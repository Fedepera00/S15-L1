package it.epicode.pizzeria.entity;

import lombok.Data;
import java.util.List;

@Data
public class Menu {
    private List<Pizza> pizzas;
    private List<Topping> toppings;
    private List<Bevanda> bevande;

    public Menu(List<Pizza> pizzas, List<Topping> toppings, List<Bevanda> bevande) {
        this.pizzas = pizzas;
        this.toppings = toppings;
        this.bevande = bevande;
    }
}