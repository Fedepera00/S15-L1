package it.epicode.pizzeria.configuration;

import it.epicode.pizzeria.entity.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PizzaConfiguration {

    @Bean
    public Pizza margherita() {
        return new Pizza("Margherita", "tomato, cheese", 1104, 4.99);
    }

    @Bean
    public Pizza hawaiian() {
        return new Pizza("Hawaiian", "tomato, cheese, ham, pineapple", 1024, 6.49);
    }

    @Bean
    public Pizza salami() {
        return new Pizza("Salami", "tomato, cheese, salami", 1160, 5.99);
    }
}