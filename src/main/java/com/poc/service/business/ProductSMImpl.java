package com.poc.service.business;

import com.poc.exception.ErrorsEnum;
import com.poc.exception.FunctionalException;
import com.poc.model.domain.Product;
import com.poc.repository.ProductRepository;
import io.micrometer.observation.annotation.Observed;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductSMImpl implements ProductSM {

    private final ProductRepository productRepository;

    @Observed(name = "add.product")
    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Observed(name = "get.product.id")
    @Override
    public Product getProductById(long id) {
        Optional<Product> productFound = productRepository.findById(id);
        if (productFound.isEmpty()) {
            throw new FunctionalException(ErrorsEnum.ERR_MCS_PRODUCT_NOT_FOUND.getErrorMessage());
        }
        return productFound.get();
    }

    @Observed(name = "get.products")
    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public String deleteProduct(long id) {
        Product productFound = getProductById(id);
        productRepository.deleteById(productFound.getId());
        return "Product deleted";
    }

}
