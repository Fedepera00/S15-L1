package it.epicode.pizzeria.runners;

import it.epicode.pizzeria.entity.Menu;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = "it.epicode.pizzeria")
public class PizzeriaApplication implements CommandLineRunner {

	private final ApplicationContext context;

	public PizzeriaApplication(ApplicationContext context) {
		this.context = context;
	}

	public static void main(String[] args) {
		SpringApplication.run(PizzeriaApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Menu menu = context.getBean(Menu.class);

		System.out.println("----- Pizzeria Menu -----");

		System.out.println("\nPizzas:");
		menu.getPizzas().forEach(pizza ->
				System.out.println(pizza.getName() + " | " + pizza.getCalories() + " calories | Price: $" + pizza.getPrice()));

		System.out.println("\nToppings:");
		menu.getToppings().forEach(topping ->
				System.out.println(topping.getName() + " | " + topping.getCalories() + " calories | Price: $" + topping.getPrice()));

		System.out.println("\nDrinks:");
		menu.getDrinks().forEach(drink ->
				System.out.println(drink.getName() + " | " + drink.getCalories() + " calories | Price: $" + drink.getPrice()));
	}
}