package FedericoCogoni.u5_w1_d4.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "Products")
@NoArgsConstructor
@Getter
@Setter
@ToString
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    protected String name;
    protected double price;
    protected int calories;

    public Product(String name, double price, int calories) {
    }
}
