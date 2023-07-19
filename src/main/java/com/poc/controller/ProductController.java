package com.poc.controller;

import com.poc.model.dto.ProductDTO;
import com.poc.service.application.ProductSA;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "products")
public class ProductController {

    private final ProductSA productSA;

    @Operation(summary = "WS used to add product")
    @PostMapping
    public ProductDTO addProduct(@RequestBody ProductDTO productDTO) {
        return productSA.addProduct(productDTO);
    }

    @Operation(summary = "WS used to get product by id")
    @GetMapping("/{id}")
    public ProductDTO getProductById(@PathVariable("id") long id) {
        return productSA.getProductById(id);
    }

    @Operation(summary = "WS used to get all products")
    @GetMapping
    public List<ProductDTO> getProducts() {
        return productSA.getProducts();
    }

    @Operation(summary = "WS used to update product")
    @PatchMapping
    public ProductDTO updateProduct(@RequestBody ProductDTO productDTO) {
        return productSA.updateProduct(productDTO);
    }

    @Operation(summary = "WS used to delete product")
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable("id") long id) {
        return productSA.deleteProduct(id);
    }

}
