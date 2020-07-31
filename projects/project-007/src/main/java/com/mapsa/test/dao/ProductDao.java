package com.mapsa.test.dao;

import com.mapsa.test.model.Product;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Esmaeil Sadeghi, 7/30/20 3:16 AM
 */
@Component
public class ProductDao {

    private List<Product> productList;

    public  List<Product> getProductList(){
        Product product1 = new Product();
        product1.setId(1);
        product1.setName("chips");
        product1.setCategory("Foodstuffs");
        product1.setCondition("new");
        product1.setDescription("This is a chips");
        product1.setManyFactors("Food");
        product1.setPrice(2000);
        product1.setStatus(true);
        product1.setUnitInStock(6);


        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Biscuit");
        product2.setCategory("Foodstuffs");
        product2.setCondition("new");
        product2.setDescription("This is a Biscuit");
        product2.setManyFactors("Food");
        product2.setPrice(1000);
        product2.setStatus(true);
        product2.setUnitInStock(6);

        productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);

        return productList;
    }

    public Product getProductById(Long id) throws IOException {
        for (Product product:getProductList( )) {
            if(product.getId() == id){
                 return product;
            }
        }
        throw new IOException("No product Fund");
    }
}
