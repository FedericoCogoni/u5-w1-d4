package FedericoCogoni.u5_w1_d4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Pizza extends Product {


    private List<String> toppings;

    public Pizza(String name, double price, int calories, List<String> toppings) {
        super(name, price, calories);
        this.toppings = toppings;

    }
}