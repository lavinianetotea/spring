package service;

import model.Product;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by trufanl on 03/10/2016.
 */
public class ProductService {

    private boolean enableLogging;

    public ProductService(boolean enableLogging) {
        this.enableLogging = enableLogging;
        if (enableLogging) {
            System.out.println("Logging enable");
        }
    }

    public Product createProduct() {
        Product product = new Product();
        product.setId(5);
        product.setName("iSomething");
        product.setPrice(500);
        product.setProducer("Apple");

        return product;
    }
}
