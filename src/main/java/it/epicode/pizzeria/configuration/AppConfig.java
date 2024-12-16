package it.epicode.pizzeria.configuration;

import it.epicode.pizzeria.entity.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public Pizza margherita() {
        return new Pizza("Pizza Margherita", "tomato, cheese", 1104, 4.99);
    }

    @Bean
    public Pizza hawaiian() {
        return new Pizza("Hawaiian Pizza", "tomato, cheese, ham, pineapple", 1024, 6.49);
    }

    @Bean
    public Pizza salami() {
        return new Pizza("Salami Pizza", "tomato, cheese, salami", 1160, 5.99);
    }

    @Bean
    public Topping cheese() {
        return new Topping("Cheese", 92, 0.69);
    }

    @Bean
    public Topping ham() {
        return new Topping("Ham", 35, 0.99);
    }

    @Bean
    public Drink lemonade() {
        return new Drink("Lemonade (0.33l)", 128, 1.29);
    }

    @Bean
    public Drink water() {
        return new Drink("Water (0.5l)", 0, 1.29);
    }

    @Bean
    public Menu menu() {
        return new Menu(
                List.of(margherita(), hawaiian(), salami()),
                List.of(cheese(), ham()),
                List.of(lemonade(), water())
        );
    }
}