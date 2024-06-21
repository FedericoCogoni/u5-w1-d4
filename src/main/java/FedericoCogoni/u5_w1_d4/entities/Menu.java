package FedericoCogoni.u5_w1_d4.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
@Getter
public class Menu {

    private List<Topping> toppings;
    private List<Drink> drinks;
    private List<Pizza> pizzas;

    public void menuPrint(){
        System.out.println("Menu");
        System.out.println();
        System.out.println("Pizzas");
        System.out.println();
        this.pizzas.forEach(System.out::println);
        System.out.println();

        System.out.println("Toppings");
        System.out.println();
        this.toppings.forEach(System.out::println);
        System.out.println();

        System.out.println("Drinks");
        System.out.println();
        this.drinks.forEach(System.out::println);

    }
}
