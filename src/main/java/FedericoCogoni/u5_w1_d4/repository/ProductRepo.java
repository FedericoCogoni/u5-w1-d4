package FedericoCogoni.u5_w1_d4.repository;


import FedericoCogoni.u5_w1_d4.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepo extends JpaRepository<Product, UUID> {
}
