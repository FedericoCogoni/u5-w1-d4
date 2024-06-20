package FedericoCogoni.u5_w1_d4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Topping  extends Product {

    public Topping(String name, double price, int calories) {
        super(name, price, calories);

    }
}