package FedericoCogoni.u5_w1_d4.servicies;

import FedericoCogoni.u5_w1_d4.entities.Product;
import FedericoCogoni.u5_w1_d4.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductServices {

    @Autowired
    private ProductRepo productRepo;

    public void saveProduct(Product product){
        productRepo.save(product);
        System.out.println("Nuovo prodotto salvato correttamente");
    }
}
