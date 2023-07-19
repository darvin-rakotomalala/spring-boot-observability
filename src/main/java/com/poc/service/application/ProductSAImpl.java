package com.poc.service.application;

import com.poc.mapper.ProductMapper;
import com.poc.model.dto.ProductDTO;
import com.poc.service.business.ProductSM;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductSAImpl implements ProductSA {

    private final ProductSM productSM;
    private final ProductMapper productMapper;

    @Override
    public ProductDTO addProduct(ProductDTO productDTO) {
        return productMapper.toDTO(productSM.addProduct(productMapper.toDO(productDTO)));
    }

    @Override
    public ProductDTO getProductById(long id) {
        return productMapper.toDTO(productSM.getProductById(id));
    }

    @Override
    public List<ProductDTO> getProducts() {
        return productMapper.toDTO(productSM.getProducts());
    }

    @Override
    public ProductDTO updateProduct(ProductDTO productDTO) {
        ProductDTO productFound = getProductById(productDTO.getId());
        productFound.setName(productDTO.getName());
        productFound.setPrice(productDTO.getPrice());
        productFound.setDescription(productDTO.getDescription());
        productFound.setProductType(productDTO.getProductType());
        return productMapper.toDTO(productSM.addProduct(productMapper.toDO(productFound)));
    }

    @Override
    public String deleteProduct(long id) {
        return productSM.deleteProduct(id);
    }

}
