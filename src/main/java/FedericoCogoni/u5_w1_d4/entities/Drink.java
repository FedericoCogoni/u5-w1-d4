package FedericoCogoni.u5_w1_d4.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Entity
@Getter
@Setter
public class Drink  extends Product {
    public Drink(String name, double price, int calories) {
        super(name, price, calories);
    }
}