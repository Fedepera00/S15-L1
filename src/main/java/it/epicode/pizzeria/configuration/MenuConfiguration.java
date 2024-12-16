package it.epicode.pizzeria.configuration;

import it.epicode.pizzeria.entity.Menu;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List; // Import della classe List

@Configuration
public class MenuConfiguration {

    @Bean
    public Menu menu(PizzaConfiguration pizzaConfig, ToppingConfiguration toppingConfig, BevandaConfiguration bevandaConfig) {
        return new Menu(
                List.of(
                        pizzaConfig.margherita(),
                        pizzaConfig.hawaiian(),
                        pizzaConfig.salami()
                ),
                List.of(
                        toppingConfig.cheese(),
                        toppingConfig.ham(),
                        toppingConfig.pineapple()
                ),
                List.of(
                        bevandaConfig.lemonade(),
                        bevandaConfig.water(),
                        bevandaConfig.wine()
                )
        );
    }
}