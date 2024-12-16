package it.epicode.pizzeria.runners;

import it.epicode.pizzeria.entity.Menu;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MenuRunner implements CommandLineRunner {

    private final ApplicationContext context;

    public MenuRunner(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void run(String... args) {
        // BEAN
        Menu menu = context.getBean(Menu.class);

        System.out.println("\n--- MENU' COMPLETO ---\n");

        // PIZZE
        System.out.println("Pizzas:");
        menu.getPizzas().forEach(pizza ->
                System.out.println(pizza.getName() + " | " + pizza.getCalories() + " calories | Price: $" + pizza.getPrice()));

        // TOPPINGS
        System.out.println("\nToppings:");
        menu.getToppings().forEach(topping ->
                System.out.println(topping.getName() + " | " + topping.getCalories() + " calories | Price: $" + topping.getPrice()));

        // BEVANDE
        System.out.println("\nDrinks:");
        menu.getBevande().forEach(bevanda ->
                System.out.println(bevanda.getName() + " | " + bevanda.getCalories() + " calories | Price: $" + bevanda.getPrice()));
    }
}