package FedericoCogoni.u5_w1_d4.runners;

import FedericoCogoni.u5_w1_d4.U5W1D4Application;
import FedericoCogoni.u5_w1_d4.entities.Pizza;
import FedericoCogoni.u5_w1_d4.servicies.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private ProductServices productServices;
    @Autowired
    private AnnotationConfigApplicationContext contex;


    @Override
    public void run(String... args) throws Exception {
        Pizza pizza2= (Pizza) contex.getBean("getMargheritaPizza");
        System.out.println(pizza2);
        productServices.saveProduct(pizza2);
    }
}
