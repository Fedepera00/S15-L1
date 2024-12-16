package it.epicode.pizzeria.runners;

import it.epicode.pizzeria.entity.Bevanda;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BevandaRunner implements CommandLineRunner {

    private final ApplicationContext context;

    public BevandaRunner(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void run(String... args) {
        System.out.println("\nBevande:");
        context.getBeansOfType(Bevanda.class).forEach((name, bevanda) ->
                System.out.println(bevanda.getName() + " | " + bevanda.getCalories() + " calories | Price: $" + bevanda.getPrice()));
    }
}