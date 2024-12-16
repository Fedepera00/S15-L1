package it.epicode.pizzeria.runners;

import it.epicode.pizzeria.entity.Pizza;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class PizzaRunner implements CommandLineRunner {
    private final ApplicationContext context;

    public PizzaRunner(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void run(String... args) {
        System.out.println("Pizzas:");
        context.getBeansOfType(Pizza.class).forEach((name, pizza) ->
                System.out.println(pizza.getName() + " | " + pizza.getDescription() + " | Price: $" + pizza.getPrice()));
    }
}