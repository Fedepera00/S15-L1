package it.epicode.pizzeria.configuration;

import it.epicode.pizzeria.entity.Bevanda;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BevandaConfiguration {

    @Bean
    public Bevanda lemonade() {
        return new Bevanda("Lemonade", 128, 1.29);
    }

    @Bean
    public Bevanda water() {
        return new Bevanda("Water", 0, 1.29);
    }

    @Bean
    public Bevanda wine() {
        return new Bevanda("Wine", 607, 7.49);
    }
}