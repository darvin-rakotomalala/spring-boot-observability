package com.poc.service.application;

import com.poc.model.dto.ProductDTO;

import java.util.List;

public interface ProductSA {
    ProductDTO addProduct(ProductDTO productDTO);
    ProductDTO getProductById(long id);
    List<ProductDTO> getProducts();
    ProductDTO updateProduct(ProductDTO productDTO);
    String deleteProduct(long id);
}
