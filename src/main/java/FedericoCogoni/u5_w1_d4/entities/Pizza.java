package FedericoCogoni.u5_w1_d4.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Pizza extends Product {

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "pizza_toppings",
            joinColumns = @JoinColumn(name = "pizza_id"),
            inverseJoinColumns = @JoinColumn(name = "topping_id")
    )
    private List<Topping> toppings;

    public Pizza(String name, double price, int calories, List<Topping> toppings) {
        super(name, price, calories);
        this.toppings = toppings;

    }
}