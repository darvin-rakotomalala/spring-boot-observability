package com.poc.mapper;

import com.poc.common.mapper.DtoMapper;
import com.poc.model.domain.Product;
import com.poc.model.dto.ProductDTO;
import org.mapstruct.Mapper;

@Mapper
public interface ProductMapper extends DtoMapper<ProductDTO, Product> {

}
