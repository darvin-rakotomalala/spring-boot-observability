package com.poc.service.business;

import com.poc.model.domain.Product;

import java.util.List;

public interface ProductSM {
    Product addProduct(Product product);
    Product getProductById(long id);
    List<Product> getProducts();
    String deleteProduct(long id);
}
