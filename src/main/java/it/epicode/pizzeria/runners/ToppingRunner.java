package it.epicode.pizzeria.runners;

import it.epicode.pizzeria.entity.Topping;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ToppingRunner implements CommandLineRunner {
    private final ApplicationContext context;

    public ToppingRunner(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void run(String... args) {
        System.out.println("Toppings:");
        context.getBeansOfType(Topping.class).forEach((name, topping) ->
                System.out.println(topping.getName() + " | Price: $" + topping.getPrice()));
    }
}